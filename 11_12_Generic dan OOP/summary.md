# (11 dan 12) Generic dan OOP
## Resume
Materi ini mempelajari
1. OOP
2. Encapsulation
3. Data Abstration
4. Inheritance
5. Polymorphism

OOP itu sebuah paradigma pemrograman yang memeberlakukan semua benda di sekitar kita sebagai objek. Misalkan sebuah mobil. objek memiliki properti dan behavior.
properti misalkan di sebuah mobil itu ada roda, warna, lebat, panjang, dll. sedangkan behavior itu kegiatan objek tersebut. dia bisa ngapain saja. misal maju, mundur, belok, mengerem, dll.

OOP fundamental concept
1. Encapsulation
2. Data Abstration
3. Inheritance
4. Polymorphism

### Encapsulation
adalah proses dimana object yang dibungkus di sebuah yang namanya modifier. class itu object yang bentuknya belum kelihatan kalau objek kelas yang sudah terbentuk menjai sebuah
bentuk yang lebih terlihat. penulisan class dalam java menggunakan yang namanya pascal case (ex. DinaSabtu). jikalau method menggunakan camelCase (ex. dinaSabtu).

#### membuat object /instance
panggil class dengan kata kunci "new". new itu salah satu identifier untuk membuat sebiah object. 

#### Atribute type java
- public (bisa di akses oleh siapa saja)
- protected (hanya bisa di akses)
- private (hanya bisa di akses oleh class itu sendiri)

#### method dan functions
perbedaanya terletak di return. method tidak ada returnd. sedangkan function ada.

#### Getter dan Setter.
getter digunakan untuk mengambil. sedangkan setter digunakan untuk meng-set (mengisi). digunakan untuk si private. agar nilai yang di dalam private bisa di buat public.

### Data abstraction
adalah objek yang mash bersifat sangat umum. Hiding background process from user. 

### Inheritance (overriding)
"Extend". Menurunkan sifat. object yang sangat mirip, mereka berbagi logika umum. tetapi mereka tidak sama. di ibaratkan seperti bapak dan anak. biasanya sifat ayah akan turun ke anaknya.
"super" digunkan untuk memanggil method parent-nya.

### Polymorphism
Method dengan nama yang sama tetapi output berbeda. satu method bisa di pakai berulang ulang di berbagai objek. (overloading)

## Task
### Challenge 1. Enkapsulation
[challenge1.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_11_12_OOP/challenge1/Main.java)
#### screenshot
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/11_12_Generic%20dan%20OOP/screenshot/Screenshot_107.png)

### Challenge 2. Data Abstraktion
[challenge2.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_11_12_OOP/challenge2/Main.java)
#### screenshot
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/11_12_Generic%20dan%20OOP/screenshot/Screenshot_108.png)

### Challenge 3. Inheritance dan Polymorphism (Vehicles)
[challenge3.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_11_12_OOP/challenge3/Main.java)
#### screenshot
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/11_12_Generic%20dan%20OOP/screenshot/Screenshot_109.png)

### Challenge 4. Inheritance dan Polymorphism (Animasls)
### Challenge 5. Tebak kandang