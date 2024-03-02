SELECT book.name, author.name FROM book
JOIN author on author.id = book.author_id
WHERE author.name  Like '%Пушкин%' ;
