const app = angular.module("shopping-cart-app",[]);

	/* QUẢN LÍ GIỎ HÀNG */

app.controller("shopping-cart-ctrl", function($scope, $http) {
	$scope.cart = {
		items:[],
		
		add(id){
			var item = this.items.find(item => item.id == id);
			if(item) {
				item.qty++;
				this.saveToLocalStorage();
			}
			else {
				$http.get(`/rest/products/${id}`).then(resp => {
					resp.data.qty = 1;
					this.items.push(resp.data);
					this.saveToLocalStorage();
				})
			}
		},
		
		remove(id){
			var index = this.items.findIndex(item => item.id == id);
			this.items.splice(index, 1);
			this.saveToLocalStorage();
		},
		
		clear(){
			this.items = []
			this.saveToLocalStorage();
		},
		
		amt_of(item){},
		
		//Tính Tổng số lượng các mặt hàng trong giỏ
		get count(){
			 return this.items.map(item => item.qty)
			.reduce((total, qty) => total += qty, 0);
		},
		
		get amount(){
			return this.items.map(item => item.qty * item.price)
			.reduce((total, qty) => total += qty, 0);
		},
		
		saveToLocalStorage(){
			var json = JSON.stringify(angular.copy(this.items));
			localStorage.setItem("cart", json);
		},
		
		loadFromLocalStorage(){
			var json = localStorage.getItem("cart");
			this.items = json ? JSON.parse(json) : [];
		},
		
		
	}
	$scope.cart.loadFromLocalStorage();
		/* Đặt hàng */
				$scope.order = {
					createDate: new Date(),
					address: "",
					account: {username :$("#username").text()},
					get orderDetails() { /* Đọc toàn bộ mặt hàng trong giỏ hàng */
						return $scope.cart.items.map(item => {
							return {
								product: {id: item.id}, /* Duyệt qua các mặt hàng trong giỏ hàng - Các mặt hàng trong giỏ thành order detail */
								price: item.price,
								quantity: item.qty
							}
						});
					},
					purchase(){
						var order = angular.copy(this); /* Lấy thông tin của giỏ hàng */
						/* Thực hiện đặt sản phẩm */
						$http.post("/rest/orders", order).then (resp => { /* Địa chỉ để đặt hàng */
							alert("Đặt hàng thành công");
							$scope.cart.clear();	/* Đặt hàng xong xóa các sản phẩm trong giỏ - chỉ tồn tại trong đơn đặt hàng */
							location.href = "/my/account";
						}).catch(error => {
							alert("Đặt hàng không thành công ! Vui lòng thử lại")
							console.log(error)
						})
					}
				}
})