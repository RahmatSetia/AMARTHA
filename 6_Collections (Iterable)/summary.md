# 6 (Collection / Iterable)
## Resume
Dalam materi ini, mempelajari :
1. Iterable
2. iterator
3. Collection
4. List
5. Stack
6. Set
7. Jenis jenis Set

### Iterable
Parent untuk semua collection di java, kecuali map.
Hanya mendukung untuk perulangan for-each loop.
Merupakan sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan kepadanya. Hirarki interface yang ada pada java. Iterable merupakan interface yang tertinggi, kemudian di bawah nya ada collection. Di bawah Collection ada Set, List, dan Queue. Set membawahi SortedSet dan membawahi NavigableSet. Queue membawahi Deque, Blockingqueue, kemudian membawahi Blockingdeque, dan TeansferQueue.
- Set = HashSet, TreeSet, LinkedHashSet.
- List = ArrayList, Linkedlist.
- Deque = ArrayDeque, LinkedList.
### Itereator
Iterator merupakan class yang me-manage iterasi dari sebuah iterable. Iterable ini mengelola pada bagian mana kita sudah melakukan iterasi pada data iterable dan mengetahui data apa yang berikutnya dapat di ambil dan bagaimana cara mengambilnya.
### Collection
Merupakan kumpulan dari objek atau data yang diletakan dalam satu tempat yang sama. Method method dalam collection diantaranya ada yang untuk penambahan, penghapusan data, memeriksa isi dari data yang tersedia, lalu Iterator dan Splitor dan juga ada method yang dihgunakan untuk melihat ukuran dari collection.
### List
Merupakan sebuah interface yang menyediakan cara untuk menyimpan data secar liniear. List merupakan turunan dari interface Collection. List dapat menerima nilai yang sama (duplicate). Urutan data pada list, tergantung kepada kapan data tersebut dimasukan kedalam list itu sendiri. Method Method yang terdapat pada List pada dasarnya digunnakan untuk me-managemen data yang ada dalam list.
Seperti menambah, menghapus, mengecheck, mencocokan antara list1 dengan list lainnya.
#### Iplementasi List
- Abstract List
- Array List
- Linked list
- Stack
1. Array List = Menyediakan penyempinan data yang dinamis. dinamis di sini berarti tidak terikat dengan kapasitas yang dapat disimpan oleh array list tersebut (sebanyak apapun). Sebenarnya terbatas, sepai array list apat melakukan perpancangan otomatis sendiri. 
2. Linked list = Merupakan struktur data yang menyipan setiap elemennya saling terhubung satu sama lain. Cara menghubungkannya adalah dengan cara menyimpan alamat memori dari masing masing elemen.
3. Immutable List = Merupakan bagian dari list. tetapi tidak dapat di ubah datanya.

#### time complexity ArrayList vs LinkedList.

#### Stack
Stack menyimpan data secara liniear, tetapi dalam penambahan atau pengambilan datanya menggunakan lifo (last in first out). ada beberapa method, diantaranya pop (mengambil data), push (menambah data), dan peek (mengintip data).

### Set
Merupakan sebuah struktur data yang dapat menyimpan sekumpulan data secara liniear sama seperti list, tetapi set tidak dapat menerima data yang sama. jika terdapat data yang sama maka akan cuma dihitung 1 saja.
1. method method hash set = Secara garis besar method method tersebut dapat digunakan untuk mengelola seluruh data atau elemen yang terdapat pada hashset. Hashset dikatakan struktur data yang tercepat untuk proses pencarian data. 
2. Linked Hashset = Menyimpan insertion order (data yang diinput terlebih dahulu makaterdapat pada urutan terdepan). 
3. enum Set = Digunakan untuk menyimpan nilai enum 
4. Sorted Set = Yang mencolok dari set ini adalah mempunyai headSet dan tailSet yang dapat digunakan untuk melihat bagian kepala dan bagian ekor pada set tersebut.

### Queue
menggunkan metode First-in-first-out. atau bisa dibilang seperti antrian. Mengambil data menggunakan Dequeue (akan mengambil data yang paling depan). menambahkan data menggunakan Enqueue (menambahkan data pada bagian belakang).
### Deque
adalah sebuah Queue yang meiliki 2 ujung. (Last-In-First-Out)

## Task
### Problem 1
- Code problem 1
[Array Merge.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_6_collection/problem_1_arrayMerge.java)
- Screenshots
  ![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/5_Time%20Complexity/screenshots/Screenshot_63.png)
