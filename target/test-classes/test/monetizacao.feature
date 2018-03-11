#language: pt
@monetizacao
Funcionalidade: Testar varias tentativas de login, corretas e incorretas

  Contexto: Acessar a URL
    Dado Que estou na URL "http://web1.qa.sambatech.com:10000/"
    E reconheço as variáveis "LOGIN"
    E escrevo no campo "Email" o conteúdo "avaliacao_qa_samba@sambatech.com.br"
    E escrevo no campo "Senha" o conteúdo "123456789"
    E clico no botão "Entrar" 
    E reconheço as variáveis "HOMEAPP"
    E clico no botão "Monetizacao"
    E reconheço as variáveis "Monetizacao"


  Cenario: Logar com sucesso  
    
    E clico no botão "Criar campanha"
    E escrevo no campo "Nome da campanha" o conteúdo "Campanha Teste"
    E fecho o browser
