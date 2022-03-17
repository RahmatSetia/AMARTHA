# (14) Join, Union, Agregasi, Subquery, Function (DBMS)
##Resume
Materi ini mempelajari :
1. Join
2. union
3. Agregasi
4. Sub-query
5. Function

###Join
query untuk menggabungkan data tabel 1 dan yang lain, minimal 2 dan bisa lebih. 
####Inner join
Irisan dari 2 atau lebih tabel. akan mendapatkan nilai yang dikedua tabel ada nilainya. 
example "SELECT t.message FROM users u INNER JOIN tweets t ON u.id = t.user_id"
####Left join
Menampilkan seluruh baris dari tabel di sebelah kiri yang dikenai ON dan hanya baris dari sebelah kanan yang memenuhi kondisi join. 

####Right join

### Union
adalah menggabungkan daata tabel 1 dengan data tabel 2. syarat menggunakan union adalah : kolom nya harus sama, tipe data sama, 

###Agregasi
bagaimana kita memproses sebuah data (kalkulasi). fungsi agregasi dalam sql ada MIN, MAX, SUM, AVG, COUNT, HAVING

####MIN
adalah fungsi agregasi dimana nilai beberapa baris dikelompokan bersama untuk membentuk nilai ringkasan tunggal yang terkecil.
Example "SELECT MIN(id) AS id FROM users" --> menampilkan id terkecil dari table users.

####MAX
adalah fungsi yang digunakan untuk mencari nilai terbesar atau maximal.

####SUM
adalah fungsi agregasi yang digunakan untuk menjumlah dari sejumlah data atu record di tabel.
Example : SELECT SUM(favorite_count) FROM tweets WHERE user_id=1

###AVG
digunakan untuk mencari nilai rata rata dari sebuah data atu record di tabel. ex : "SELECT AVG(colom) FROM table;".

### Count
Digunakan untuk mencari jumlah (bnayaknya data) dari data atau record. ex : "SELECT COUNT(1) FROM tabel WHERE kondisi".

###Having
digunakan untuk menyeleksi data berdasarkan kriteria tertentu, dimana kriteria berupa fugnsi agregat. ex "SELECT users_id FROM tweets GROUP BY user_id HAVING SUM(kolom) kondisi;". 
GROUP BY digunakan untuk mengelompokan.

###DISTINCT
Menampilkan nmilai yang unik, misalkan data 1,1,2,3 ketika di distinct maka akan tampil 1,2,3.

### Sub Query
ada query di dalam query sql lain. digunakan untuk mengembalikan data yang akan digunakan dalam query utama sebagai syarat untuk lebih membatasi data yang akan diambil.
subquery dapat digunakan dengan SELECT, INSERT, UPDATE, dan DELETE bersama dengan operator =,>,<,<=,>=, IN BETWEEN, dll. aturan dalam subquery : tertutup dala tanda kurung,
subquery hanya dapat memilik satu kolom pada klausa SELECT. SUbquery tidak dapat segera trtutup dalam fungsi SET.

### Function
kumpulan statement yang akan mengembalikan sebuah nilai balik pada pemanggilnya. Ubah terlebih dahulu delimiternya misal "DELIMITER $$", kemudian tulislan syntax sql pertama
yangman diakhiri dengan $$ delimiter yang tadi, kemudian tag "BEGIN" lalu sql ke 2 dan di tutup dengan "END" dan tutup dengan delimiter yang telah di ubah, yaitu "$$". 
untuk menggunakan function "SELECT *, NAMA_Function FROM table_x".

####DElimiter
memeberi tahu kepada mySql tentang delimiter yang digunakan, secara default menggunakan ;. 
####Return
untuk menentukan tipe data yang di return-kan oleh function.
####BEGIN-END
adalah body dari function jadi semua sql nya di tulis di sini.
###Triger