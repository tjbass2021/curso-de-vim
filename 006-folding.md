# Folding

O folding é a possibilidade de fechar linhas de códigos, muito úteis quando lidando com arquivos muito grandes. Editores de código como o VScode permitem este tipo de ação e o vim não ficaria fora dessa.

## Habilitando o folding a partir de marcações, identação e sintaxe

Para habilitar o folding de forma definitiva, é preciso adicionar o `set` no .vimrc ou init.vim para configuração no neovim:

~~~vim
set fdm
~~~

Em seguida, ainda no `vimrc`, configure o seguinte bloco de código:

~~~vim
augroup vimrc
  au BufReadPre * setlocal foldmethod=indent
  au BufWinEnter * if &fdm == 'indent' | setlocal foldmethod=manual | endif
augroup END
~~~

Isto vai habilitar o folding nos arquivos mesclando os métodos de marcações, identação e sintaxe.


## Comandos para o uso de folding

- Folding markers: <{ >}
- close one fold: zc
- open one fold: zv
- open all fold: zn
- close all fold: zm
