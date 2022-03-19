#(16) NoSql Database
## Resume
materi ini mempelajari :
1. sejarah
2. NO SQL database
3. Tipe / Kategori

### Sejarah
perkembangan database manajemen sistem, bis akita bagi menjadi 3 tahap. Tahap pertama terjadi sesuatu yang disebut datbase wars.
Tahap kedua taitu Object databases Challenge. tahap ketiga banyk berkembang database dengan konsep semi-structur.

#### Kelebihan database relatonal DB
1. Dirancang ntuk segala keprluan.
2. SQL memiliki standar yang jelas.
3. Memiliki banyak tool (administrasi, reporting, framework).

### NoSQL
not only SQL = penyimpanan data yang tidak memilik relasi. NoSQL menyediakan mekanisme yang lebih fleksibeldibanding dengan RDBMS.

#### Kelebhan
- schema less
- fast development
- support big size file
- support cluster

diguanakan ketika membangun skema yang fleksibel, ACID tidak diperlikan, terdistribusi, data logging, data sementara. tidak direkomendasikan
untuk menyimpan data data finasial, data transaksi, data pentign dalam bisnis, dan data yan sangat mementingkan ACID.

#### Kaidah CAP
- Consistency = setiap proses baca mendapatkan data dari proses penulisan terakhir.
- Availability = setiap request mendapatkan resppon yang bukan error.
- Partition = DBMS dapat beroperasi meskipun ada kesalahan jaringan.

tidak ada DBMS yang dapat memiliki semua kaidah diatas. maksima memiliki 2 dari kaidah CAP ini. 

#### Schema Less
1. traditional RDBMS
   1. tidak bisa menambahkan data yang tidak sesuai skema.
   2. perlu menambahkan data "NULL" pada item yang tidak memiliki data.
   3. memiliki tipe data yang strict.
   4. tidak dapat menambah beberapa item data pada sebuah field.
2. NoSQL DBMS
   1. tidak memiliki schema ketika menambahkan data.
   2. aplikasi menangani proses validaitipe data.
   3. mendukung proses agragasi  dokumen pada item.

### Tipe / kategori
1. key / value. ex redis.
   - tipe jenis ini merupakan yang paling simpel. sesimpiel seperti key dan value. bisanya data disimpan dalam bentuk
   hashtable yang setiap key na unik. setiap data yagn tersimpan akann diakses menggunakan key dan data data nya disimpan
   di memori. menggunaka sistem cache untuk penyimpanan sementara. 
2. colom familt. ex casandra.
   - no sql ini akam ,entimpad data perkolom. kelebihan nya untuk mencari data yang kompleks bisa dengan mudah dan cepat.
3. graph. ex neo4g.
   - no sql jenis ini memodelkan relasi dari data. sehingga hubungan data satu dengan yang lainnya tergambar dengan jelas.
   konsep konsep yang ada dalam graph. Nodes (entity atau data yang memiliki label); Edges (garis yang menghubungkan atar node);
   Properti (data pada nodes ataupun edges). bisa digunakan untuk social network analisis. 
4. dokumen based. ex mongoDB
   - no sql jenis ini menyimpan informasisebagai dokumen, dengan konsep collections. bisa di gunakan untuk data yang tidak terstruktur
   misalnya logging (pencatatan aktivity). 