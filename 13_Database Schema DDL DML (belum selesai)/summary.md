# (13) Database Scheme, DDl, DML
##Resume
materi ini mempelajari :
1. Schema Database
2. Databae Realationship
3. RDBMS
4. saf
5. sf
6. af

### Schema Database
Berkaitan dengan bagaimana kita mendesain atau menstruktur sebuah database. 
#### model
adalah sebuah tindakan mendesain dari data data lalu kita modeling ke database. kalau di backend enginer biasanya
kebalikannya, dari data base bagaimana kita akan modeling ke code-nya. misalkan nama berarti di data base menggunakan tipe
string. di bagian APi juga string. dan lain sebagainya. dalam modeling data tentukn nama, tipe data, jumlah data maks.
#### Tipe data
- int
- varchar
- LongText
- Tinytext (misalkan data jenis kelamin. l/p)
- Decimal
- DateTime
- Binary (1 / 0)
- TimeStamp (mengkonvert time ke dalam bentuk angka)

### Database Relationship
hubungan entity dalam database atau hubungan antar tabel.
- one to one (1 data dengan 1 data. misalkan 1 akun memiliki 1 foto profil)
- one to many (misalkan satu ackun memposting banyak tweet)
- many to many (misalkan satu mahasiswa bisa mengambil banyak matkul, suatu matkul juga bisa diambil oleh banyak mahasiswa)

#### Bagaimana me-implementasikan relationship
ERD (entity relationship diagram) mendesain relatioship anatar tabel.

### RDBMS
sebuah aplikaasi(yagn bersifat sql) yang digunakan untuk manajemen sistem. misalkan navicat, MySQL Workbench, dll.

####SQL
Structured Query Language. bahasa pemrograman khusus yang dihunakan untuk memanajemen data dalam RDBMS.

### Jenis perintah SQL
####DDL Data Definition Language
membuat struktur data. perintah untuk membuat, megnubah, dan menghapus struktur dan definisi metadata dari objek-objek
database. 
- DDL Statement (CREATE DATABASE databse_name; USE databse_name; CREATE TABLE ...,ALTER TABLE ..., DROP TABLE ..., RENAME TABLE ...,)
####DML Data Manipulatin Language (CRUD)
mengisi struktrtur data nya. INSERT = emmasukan data, SELECT = mendapatkan data, UPDATE = update data, DELETE = menghapus.

####DML Statement
- LIKE (pencarian suatu nilai yang mengandung suatu data atau tidak).
- BETWEEN (misalkan mecari data dengan user id 1 sampai 3. gunakan BETWEEN. Ex : "SELECT kolom FROM tabel WHERE kolom_acuan 
BETWEEN 1 AND 3";).
- AND / OR.
- ORDER BY (melakukan sebuah sorting).
- LIMIT (membatasi nilai yang ditampilkan "LIMIT 2" berarti menampilkan 2 data).
####DCL Data Control Language
#### DTL Data Transaction Language





