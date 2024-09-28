## Autores

- [Glayson Brenno Dumaresq dos Santos](https://github.com/brenno182021)

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

### Funcionalidades

1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar()`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Diagram UML (Mermaid)

```mermaid
classDiagram
    iPhone --|> SmartPhone
    SmartPhone : +String marca
    SmartPhone : +ReprodutorMusical reprodutorMusical
    SmartPhone : +NavegadorInternet navegadorInternet
    SmartPhone : +AparelhoTelefonico aparelhoTelefonico
    SmartPhone --|> AppleMusic
    SmartPhone --|> Telefone
    SmartPhone --|> Safari
    AppleMusic --|> ReprodutorMusical
    Safari --|>  NavegadorInternet
    Telefone --|> AparelhoTelefonico

    class AppleMusic{
        +Boolean statusMusica
        +String musica;
        +ReprodutorMusical()
    }

    class Safari{
        +NavegadorInternet()
    }

    class Telefone{
        +AparelhoTelefonico()
    }

    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
      +ligar()
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorInternet{
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
```
