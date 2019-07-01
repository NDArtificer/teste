$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/teste/resource/Cadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastro de costumer",
  "description": "Administrador do site cadastra um costumer\r\ne validadar se o mesmo foi adcionado a lista de login.",
  "id": "cadastro-de-costumer",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "O administrador Cadastra um costumer",
  "description": "",
  "id": "cadastro-de-costumer;o-administrador-cadastra-um-costumer",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "login como admin",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "acesso o menu Accounts \u003e\u003e customers",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "eu clico no botão add",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu preencho os campos",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "eu clico no botão submit",
  "keyword": "Entao "
});
formatter.step({
  "line": 14,
  "name": "voltarei para pagina de customers",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroSteps.login()"
});
formatter.result({
  "duration": 127161101,
  "error_message": "java.lang.NullPointerException\r\n\tat net.phptravels.Teste.CadastroSteps.login(CadastroSteps.java:37)\r\n\tat ✽.Dado login como admin(src/teste/resource/Cadastro.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CadastroSteps.acessarCustomers()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CadastroSteps.adcionarCustomer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CadastroSteps.preenchoCampos()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CadastroSteps.salvarCustomer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CadastroSteps.visualizarCustomers()"
});
formatter.result({
  "status": "skipped"
});
});