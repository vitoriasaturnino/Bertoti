  ## 1. Perceptível
 
  __1.1 Alternativas de texto:__
  É muito importante dar alternativas de texto para conteúdosnão textuais, para que possa ser alterado para outras formas que as pessoas precisem, como letras grandes, braille, fala, símbolos ou linguagem mais simples.
 
 
 ![Ex. imagem com descrição](https://spguia.melhoresdestinos.com.br/system/fotos_local/fotos/47843/show/cachoeiras-do-prata.jpg)

Implementação da descrição dessa imagem usando a Tag Alt:

 ```
<img alt="Cachoeiras-do-prata" src="https://spguia.melhoresdestinos.com.br/system/fotos_local/fotos/47843/show/cachoeiras-do-prata.jpg">
 ```
 # 

__1.2 Mídia baseada em tempo__


__1.3 Adaptável__
# 

É muito importante garantir que o conteúdo possa ser apresentado em diferentes layouts sem perder informações ou estrutura. como os exempolas a abaixo:

- __Orientação__

O conteúdo da página não se restringe a somente uma forma de exibição (como paisagem ou retrato), a menos que uma orientação de exibição seja específica seja definida previamente. O layout deve se adequar ao tamanho da viwport como podemos observar nos exemplos abaixo:

 ![Ex. conteúdo adaptável tamanho 1](https://user-images.githubusercontent.com/68754092/158474397-2929872c-1cea-44ba-bb57-aa0efc07f2bd.png)
![Ex. conteúdo adaptável tamanho 2](https://user-images.githubusercontent.com/68754092/158474493-5d5dbcb1-9ef9-42a9-b603-939a08450038.png)
![Ex. conteúdo adaptável tamanho 3](https://user-images.githubusercontent.com/68754092/158474394-f7a86f7e-659c-4dbf-9ec5-ae62ef937932.png)

- __Identificar o propósito de entrada__

A finalidade para o conteúdo de cada campo de entrada deve ser explicita.

 ![Ex. campos de entrada com a expecificação para a informação que deve ser inserida](https://user-images.githubusercontent.com/68754092/158474998-09879009-4df7-4174-ae53-3f14c36ef2fa.png))

 ![Ex. campos de entrada sem as expecificação para a informação que deve ser inserida](https://user-images.githubusercontent.com/68754092/158474809-8ac71fb3-32a0-4829-bab7-a2eb67cecac5.png))

__1.4 - Distinguível__
# 

Faça com que seja simples para o seu usuário ver e ouvir o conteúdo, incluindo a distinção do primeiro plano do plano de fundo. como nos exemplos abaixo: 

- __Uso de cor__

Podemos usar as cores como uma ótima forma de exibir informações so usuário, como por exemplo  indicar uma ação, solicitar uma resposta, distinguir um elemento visual ou informar se um processo foi concluído com sucesso ou não.

![Ex. forma incorreta de utilizar cores](https://user-images.githubusercontent.com/68754092/158473960-4ce835a8-3877-46d3-9f32-7f637983ea3c.png)

![Ex. de uso correto de cores para tranmitir mensagens](https://user-images.githubusercontent.com/68754092/158474082-bbf08d3b-5d4a-4fbf-bd87-8e8740519a29.png)

- __Contraste__ 
  
A apresentação visual de texto e imagens na página devem ter contraste de forma que as informções principais s sobresaiam e fique mais fácil distingui-las.

Exemplo sem contraste, note como é difícil ler as informações da página:
![pagSemContraste](https://user-images.githubusercontent.com/68754092/158473145-e34eacf2-fe74-459f-8206-913423097d75.png)

Agora nesste exemplo temos um contraste adequado entre o fundo e as informções principais, tornando a compreenção mais clara.
![pagComContraste](https://user-images.githubusercontent.com/68754092/158473208-bf1d57b5-b3be-43d3-b8e6-e6c9b166e3de.png)

__Conteúdo ao passar o mouse ou foco__

Podemos fazer uso de um conteúdo adicional para se tornar visível e depois oculto, de acordo com a passagem do mause por cima do objeto. 


Podemos notar algumas altrações  quando passamos o mouse sobre alguns elementos do site, mostrando que eles estão selecionados.

![G1 - O portal de notícias da Globo - Google Chrome 2022-03-15 17-33-49 (1)](https://user-images.githubusercontent.com/68754092/158477511-e8c04cfe-5a8b-44b2-b0b3-dccb179d5e47.gif)


## 2. Operável

__2.1	Teclado acessível__
# 

Todas as funcionalidades devem ser interativas a partir de um teclado.

![gif avançando pelos objetos usando a tecla tab](https://user-images.githubusercontent.com/68754092/158480171-0894b4bb-248f-4358-b113-62cac50965e8.gif)

mostrar como é implenmentado no "código"

__2.2 Tempo suficiente__
# 

mantenha o conteudo presente na tela por tempo suficiente para que o usuiário possa ler ou interagir.

Exemplos

__2.3 - Convulsões e Reações Físicas__
# 

Não crie conteúdo de uma forma conhecida por causar convulsões ou reações físicas.

colocar elementos que pisquem mais de 3 vezes em menos de um segundo pode causar crises convulsivas em alguns usuários, por esse motivo devem ser evitadas em todos os casos

__2.4 - Navegável__
# 

Forneça maneiras de ajudar os usuários a navegar, encontrar conteúdo e determinar os passos seguntes até encontrar seu objetivo.

- __Ordem de foco__

Deixe sua pagina o mais intuítiva possível, faça com que  os próximos elementos da sequência sejam destacados para uma melhor experiência do usuário na navegação.

ex algum formulário com "linha do tempo dos passos"


- __Localização__

Informações sobre a localização do usuário em um conjunto de páginas da Web estão disponíveis.

- __Objetivo do link__

A finalidade de cada link deve ser explicita apenas pelo texto do link.

__2.5 - Modalidades de Entrada__
# 

## 3 Compreensível

O conteúdo e navegabilidade da interface devem ser claras ao usuário.

__3.1 Legível__
# 

Torne o conteúdo do texto legível e compreensível.

- __Abreviaturas__

Identifique por extenço o significado das abreviaturas.


__3.2 Previsível__
# 

As páginas web devem aparecer e operar de maneira previsível

__3.3 Assistência de entrada__

Ajude o usuário a evitar erros, caso não seja possível os torne visíveis e mostre a maneira mais simples de resolve-los
# 

- __Erro de identificação__

Se um erro de entrada for detectado, o item que está com erro é identificado, o erro é descrito para o usuário em texto para que o mesmo consiga executar o processo de forma correta

ex de erro login

- __Prevenção de erros__

Para páginas da Web que exigem que o usuário envie informações, pode se disponibilizar dicas de como o conteúdo deve ser inserido

## 4. Robusto

Maximize a compatibilidade com agentes de usuário atuais e futuros, incluindo tecnologias assistivas.

__4.1 Compatível__


