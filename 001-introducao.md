# Introdução ao Vim

---

## Comandos básicos

### Abrindo e fechando o vim

- `vim`: comando para abrir o Vim no terminal.
- `:q` ou `:q!`: comandos para sair do Vim.

> O uso da '!' no segundo comando serve para forçar o comando.

### Salvando um arquivo

- `:w`: comando para salvar um documento criado ou alterado com o Vim.

> Para alterar entre o modo de inserção e o modo de comando, use `esc`.

É possível combinar os comandos. Por exemplo, ao salvar eu quero sair logo em sequência, logo, eu posso usar os comandos combinados `:wq`.

### Modo de inserção

Ao abrir o documento, não é possível editá-lo logo de cara, para isso é preciso entrar no modo de inserção, então basta apertar a tecla `i`.

### Movimentando entre o conteúdo do texto

Para mover dentro do conteúdo do texto com eficiência, utiliza-se as teclas `h`, `j`, `k` e `l`.

Onde:

- **H**: move para a esquerda;
- **J**: move para baixo;
- **K**: move para cima;
- **L**: move para a direita.

### Deletando caracteres:

Além de poder deletar caracteres utilizando 'backspace', torna-se mais eficiente utilizar a tecla `x`. Mas cabe salientar que isto é no modo de comando, não no modo de inserção.
