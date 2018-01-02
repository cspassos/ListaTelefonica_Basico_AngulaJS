angular.module("listaTelefonica").controller("listaTelefonicaCtrl", function($scope, $http, $filter, serialGenerator, contatosAPI, operadorasAPI) {
            $scope.app = "Lista Telefonica";
			$scope.contatos  = [];
			$scope.operadoras = [];
			$scope.messag = {};

			var carregarContatos =function () {
				contatosAPI.getContatos()
                    .success(function (data, status) {
						$scope.contatos  = data;
					}).error(function(data) {
						$scope.message = "Aconteceu um problema: " + data;
					})
			}
			
			var carregarOperadoras =function(){
				operadorasAPI.getOperadoras()
					.success(function (data, status) {
						$scope.operadoras = data;
					}).error(function (data, status) {
						$scope.message = "Aconteceu um problema: " + data;
					});
			}
			//get -> Obter recursos || post -> Criar entidade 
			//poderiamos estar passando variavel por variavel, mas podemos criar
        	//uma abstracao, que no caso pode ser contato, contendo nome e telefone
        	// $scope.adicionarContato = function(nome, telefone) {
			$scope.adicionarContato =function(contato) {
				contato.serial = serialGenerator.generate();
                contato.data = new Date();
				contatosAPI.saveContato(contato)
					.success(function (data) {
						delete $scope.contato;
						$scope.contatoForm.$setPristine();
						carregarContatos();
					}).error(function(data) {
						$scope.message = "Aconteceu um problema: " + data;
					})
			};

			$scope.apagarContatos = function (contatos) {
				//filtrando os contatos selecionados com filter
				// var contatosSelecionados = contatos.filter(function(contato){
				//     if(contato.selecionado) return contato;
				// });
				// console.log(contatosSelecionados);
				//nao precisamos deletar os contatos selecionados
				//apenas podemos retornar os contatos nao selecionados 
				//e atribuir novamente a $scope.contatos
				$scope.contatos =contatos.filter(function (contato) {
					if(!contato.selecionado) return contato;
				})
			};
			$scope.isContatoSelecionado = function (contatos) {
				return isContatoSelecionado = contatos.some(function (contato) {
					return contato.selecionado;
				})
			};
			$scope.ordenarPor = function (campo) {
				$scope.criterioDeOrdenacao = campo;
			};
			carregarContatos();
			carregarOperadoras();
		});