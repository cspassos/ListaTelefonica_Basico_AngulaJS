//O config configura o provider
angular.module("listaTelefonica").config(function (serialGeneratorProvider) {
    serialGeneratorProvider.setLength('5');
})