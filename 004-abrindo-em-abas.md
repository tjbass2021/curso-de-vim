# Abrindo os arquivos em diferentes abas no vim

---

No vim é possível abrir os arquivos em abas e alterar entre eles de forma bastante ágil.

- Para abrir vários arquivos de uma vez em abas digite:

    `vi -p arquivo1.txt arquivo2.md arquivo3.js`

- Para alterar entre diferentes abas, no modo NORMAL digite:

    `gt`

- Para alternar do último para o primeiro, use:

    `g+SHIFT+t`

- Para fechar todos os arquivos, use, no modo de COMANDO:

    `:qa`

- Para abrir um arquivo em uma nova aba, digite, no modo de COMANDO:

    `tabedit <nomedoarquivo>` ou `tabe <nomedoarquivo>`

- Para fechar uma aba específica sem precisar estar nela, basta digitar no modo de COMANDO:

    `tabclose <numerodaaba>`


