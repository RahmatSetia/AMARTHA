# (18) System Desiign
## Resume
Materi ini memplajari :
1. Diagram
2. Distributed System
3. Job Queue dan Microservices
4. SQL dan No SQL
5. Cache dan Indexing

### Diagram
adalah sebuah simbol yang merepresentasikan informasai apa yang mau kita sampaikan dalam hal ini desain sistem.
kenapa diagram ? karena untuk mempermudah dalam membuat dan mudah di baca ketika mendesain sebuah sistem. tool digunakan
untuk emempermudah dalam mendesain sebuah sistem. misal draw.io. yang paling sering digunakan ketika mendesain sistem sofware
biasanya (umumnya) ada 4. Flowchart, Use Case, ERD, HLA (High level architecture). 

####FLowChart
sebuah representasi dari sebuah diagram yang mem-visualisasikan sebuah alur. example : Lucid's Flowchart TEmplate.

####Use Case Diagram
sebuah ringkasan dari sebuah sistem kita itu ada siaoa saja dan interaksinya dengan aktor (pelaku atau pengguna). example : Lucid's
"Banking System Diagram".

####ERD
jenis dari flowchart yang menggambarkan bagaimana "entities" misalkan orang, objeck atau suatu konsep yang terhubung satu sama lain
di dalam suatu sistem.

####High Level Architecture
sistem desain secara keseluruhan

### Horizontal Salling and Vertical Scalling
ketika kita mendesain sebuah sistem yang besar, bisa dengan solusii :
- perbedaan architectural apa uang bisa digunakan.
- apakah bagian tersebut saling terhubung satu sama lain ?
- bagaimama meng-optimasi dadri bagian tersebut.

pertanyaan di atas bisa di jawab dengan distributed system. menggunakan banyak server.

#### Karatkeristik Distributed System
1. Scalability
2. Reliability
3. Availability
4. Efficiency
5. Serviceability or Management

#### Scalability
mmisalkan di sistem kita dalam 1 hari mampu mengastasi 20 perhari. hari ini ada 10 transaksi,
berarti sistem kita masih aman. Di hari selanjutnya sistem kita mendapat pesana 30. caranya dengan
men upgrade sistem kita (misalkan hardware, ganti bahasaa pemrograman, ganti arsitektur). atau bisa 
dengan dilakukan beli server lagi. 
- Vertical Scalability (menambah availibity dari sistem kita. ketika mempunyai waktu yang lumayan panjang).
- Horizontal Scalability (duplikasi server. ketika kenutuhannya besar).

####Reliability
sebuah keadaan dari sistem jangan sampai gagal dalam meberikan layanan. meletakan server di beberapa tempat.

####Availibilty
Ketersediaan, bisakah diakses sistem kita ? on time terus atau tidak. dll.

####Efficiency
waiting response jangan terlalu lama. standarnya maksimal 2 detik. untuk memepercepat ada beberapa faktor.

####Serviceability or Manageability
mem-maintenence. dengan clean code bisa memepermudah ketika maintenance.


### Job/Work Queue
berjalan secara asyncronus

### Load Balancing
komponent penting setelah sistem distribusi. digunakn untuk membagi traffic. dia akan mencari trafic
yang free atau bebas. Bisa diaplikasikan ketika :
- di antara user dan server.
- antara server  dan internal platform, seperti aplication server or cache server.
- antara internal later dan databse.

###Monolithic dan Microservicesses
Monolithic : satu sistem banyak service yang diletakann di satu sevice. kalau sistem masih kecil ok ok saja.
Sedangkan Microserviceses : Service yang ada dalam sistem kita pecah pecah (bagi bagi). walaupun cost nya lebij banyak.
baik untuk sistem yang sudah banyak aktivity.. misalkan dalam 1 detik menangani 1 juta services.
ketika satu server down, tidak akan mengganggu server atau service yang lain.

###SQL vs Non-SQL
Relational Databse adalah adalah database yang saling berhubungan yagn sifatnya terstruktur di awal.
sedangkan Non-Relational adalah databse yang bebas, tidak terstruktur, tidak punya relasi. cocok untuk Logging.

####manfaat relational DB
- dirancang untuk segala keperluan.
- mempunyai standar yang jelas.
- banyak tools. karena sudah lama.

prinsip dalam relational DB
- Atomicity (transaksi semua terjadi atau tidak sama sekali).
- Consistency (data tertulis merupakan data valid berdasarkan aturan tertentu).
- Isolation (ketika terjadi request secara bersamaan(concurrent) memastikaan bahwa transakasi terjadi secara sekuensual).
- Durability (transaksi yang tersimpan tetap tersimpan).

#### NO SQL (Not Only Sequel)
cara pandang yang baru terhadap database. tidak punya relasi. menyediakan mekanisme yang lebih flesibel.

Kelebihan :
- skema databse sedikit
- pengembangan nya cepat
- fleksibel

tidak direkomendasikan untuk data yang penting. misal data finansial, data logging, bussines critical.

### Caching dan Indexing
Caching akan menjadi vital ketika transaksi nya sudah besar. Cache adalah penyimpanan data sementara.
ketika ada request yang sama, kita tidak perlu mengulang ngulang perintah. perintah akan di tampung di CACHE.
misalkan aset aset front end sudah terdownload ketika pertama kali akses. aset aset tersebut akan bermaanfaat ketika
link web tersrbut di panggil lagi. jadi tidak memerlukan waktu yang lama untuk mendownload ulang aset aset tersebut
karena sudah tersimpan di cache. Cache akan disimpan di RAM.    

#### Redudancy dan Replicationm
multi database yang saling berbagi dan saling terhubung. akan sangat membnatu ketika satu database down
maka akan ada backup dari database yang lainnya. 

Indexing seolah-olah kita melakukan indexing data. akan mempermudah dalam melakukan SELECT pada databse. misalkan mecari data pada
kolom nama. ketika tidak dilakukan indexing, pada saat kita akan mencari suatu nama maka time complexitynya menjadi o(n).
tetapi ketika dilakukan indexing mencari data di index nya, time complexitinya menjadi o(log n). resiko dengan indexing ketika
CREATE ata UPDATE akan lama, karena akan melakukan re-index lagi.

##TASK
### Problem 1 (belum selesai)
- ERD

![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/18_System%20Design/screenshots/problem1_ERD.png)

- Use Case

![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/18_System%20Design/screenshots/problem1_useCase.png)
### Problem 2 (belum selesai)
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/18_System%20Design/screenshots/problem2.png)
z