#language: pt
@login
Funcionalidade: Testar varias tentativas de login, corretas e incorretas

  Contexto: Acessar a URL
    Dado Que estou na URL "http://web1.qa.sambatech.com:10000/"
    E reconheço as variáveis "LOGIN"

  Cenario: Tentar logar com os campos em branco
    Quando clico no botão "Entrar"
    
    Então verifico em "MENSAGEM" o conteúdo "Email ou senha incorretos. Saiba Mais"
    E fecho o browser

  Cenario: Tentar logar preenchendo apenas o campo Email, com um usuário inexistente
    Quando: escrevo no campo "Email" o conteúdo "usuarioInexistente"

    E clico no botão "Entrar"
    Então verifico em "MENSAGEM" o conteúdo "Email ou senha incorretos. Saiba Mais"
    E fecho o browser


  Cenario: Tentar logar preenchendo apenas o campo senha, com uma senha inexistente
    Quando: escrevo no campo "Senha" o conteúdo "senhaInexistente"

    E clico no botão "Entrar"
    Então verifico em "MENSAGEM" o conteúdo "Email ou senha incorretos. Saiba Mais"
    E fecho o browser

    
   Cenario: Tentar logar preenchendo os campos Email e Senha, com usuário e senha inexistente 
   	Quando escrevo no campo "Email" o conteúdo "usuarioInexistente"
   	E escrevo no campo "Senha" o conteúdo "senhaInexistente"
   	E clico no botão "Entrar"
   	Então verifico em "MENSAGEM" o conteúdo "Email ou senha incorretos. Saiba Mais"
   	E fecho o browser
   	
   Cenario: Tentar logar preenchendo o campo Email com um usuário valido e senha inexistente
   	Quando escrevo no campo "Email" o conteúdo "avaliacao_qa_samba@sambatech.com.br"
   	E escrevo no campo "Senha" o conteúdo "senhaInexistente"
   	E clico no botão "Entrar"
   	Então verifico em "MENSAGEM" o conteúdo "Email ou senha incorretos. Saiba Mais"
   	E fecho o browser


  Cenario: Logar com sucesso 
    E escrevo no campo "Email" o conteúdo "avaliacao_qa_samba@sambatech.com.br"
    E escrevo no campo "Senha" o conteúdo "123456789"
    E clico no botão "Entrar"
    E fecho o browser
