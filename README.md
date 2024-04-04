# Api Champions LoL
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/neliocursos/exemplo-readme/blob/main/LICENSE) 

Neste repositório, está disponibilizado o código-fonte completo de uma REST API, juntamente com o Frontend, desenvolvidos durante a Santander Dev Week 2024 [Santander](https://app.santanderopenacademy.com/pt-BR/program/santander-bootcamp-2024 "Site da Santander"), 
em uma colaboração inovadora entre a DIO (Digital Innovation One) [DIO](https://www.dio.me/en "Site da DIO") e o Santander. Este projeto foi construído utilizando Java 17/21 e Spring Boot 3, 
fruto de quatro dias intensos de lives educativas, com um objetivo empolgante e único:

> :information_source: **Nota**  
> **Objetivo:** "Permitir que os usuários conversem com os campeões do League of Legends (LOL)".

Para alcançar esse objetivo, implementamos algumas das mais avançadas Inteligências Artificiais Generativas. Isso permitiu que nossa API compreendesse as personalidades distintas de cada campeão do LOL, 
possibilitando a criação de interações profundas que capturam a essência de cada um deles. O resultado é uma experiência de conversa verdadeiramente única e envolvente, que transcende a comunicação digital convencional.

**[Clique aqui para interagir com um campeão do League of Legends!](https://championsleagueoflegendsapi.netlify.app/)**

> :warning: **Observação:** A API está hospedada no Render no plano gratuito, o que pode acarretar em uma inicialização mais lenta do serviço. Portanto, ao acessar o link, por favor, tenha um pouco de paciência enquanto os dados estão sendo carregados.


Faça sua pergunta e tenha a experiência única de conversar diretamente com os campeões. Explore suas histórias e personalidades no universo de LoL!


🏛️ Arquitetura do Projeto

# Diagrama Arquitetural
A seguir, apresentamos o diagrama arquitetural do projeto **[escrito com Mermaid](https://mermaid.js.org/)**, destacando a separação das responsabilidades entre as camadas. 
Desde a interface de usuário até os mecanismos de interação com sistemas externos, passando por adaptadores, casos de uso e as entidades centrais do domínio, cada elemento é estrategicamente posicionado para reforçar a modularidade, 
a escalabilidade e a manutenibilidade do sistema. Esta estrutura facilita a compreensão de como os componentes colaboram para a realização dos objetivos do software, alinhando-se aos princípios da  **[Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)** (inclusive nas cores dos elementos).

![Arquitetura 1](https://github.com/Uillianleal/imagens/blob/main/assets-champions-lol/Captura%20de%20tela%202024-03-28%20131707.png?raw=true) 

# Banco de Dados SQL em Memória
A utilização do banco de dados H2 neste projeto serve como uma fundação ágil e flexível para modelar nosso domínio de conhecimento — os campeões do LOL. Essa escolha permite uma rápida prototipação e um ambiente de desenvolvimento eficiente, essencial para armazenar e recuperar informações detalhadas sobre cada campeão. Dessa forma, 
garantimos que as IAs Generativas que integramos possam acessar um repositório rico e detalhado, permitindo-lhes capturar com precisão a essência e a personalidade única de cada campeão, enriquecendo assim a interatividade e a profundidade das interações realizadas.

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JDBC
- Gradle - Kotlin
## Front end
- HTML / CSS / JS

## Implantação em produção
- Back end: Render
- Front end web: Netlify

# Autor
Uillian Leal Santos

linkedin: https://www.linkedin.com/in/uillian-leal-santos-06a897161/
