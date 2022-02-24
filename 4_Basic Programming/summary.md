# (4) Basic Programming
## Resume
Dalam materi ini, mempelajari :
1. Tipe data.
2. Branching
3. Looping
4. I/O Input Output
5. Operator

### Tipe data
Data yang diolah pada java memiliki bentuk bentuknya. itulah yang disebut tipe data.
Contoh : Integer, Decimal, Boolean, Char, String.
1. Tipe data Integer adalah tipe data yang dapat menyimpan nilai angka atau bilangan bulat. Jenis-jenis tipe data Integer :
- byte (-128 sampai 127) size 1 byte
- short (-32,768 sampai 32,767) size 2 bytes
- int (-2,147,483,648 sampai 2,147,483,647) size 4 bytes
- long (-9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807) size 8 bytes
2. Tipe data Decimal dapat menyimpan berupa angka atau bilangan pecahan
- float (3.4e-038 sampai 3.4e+038) 4 bytes
- double (1.7e-308 sampai 1.7e+308) 8 bytes
3. Tipe data Boolean
4. Tipe data Char
5. Tipe data String

### Variable
Variable adalah tempat yang memiliki nama dan dapat disi dengan data. sehingga kita bisa menggunakan data itu berulang kali dengan cara memanggil variable-nya saja.
#### Variable declaration
Dengan cara mengetikan dengan format (tipe_data nama_variable = value;). atau dengan versi java terbaru kita bisa mengetikan dengan formate (var nama_variabel = value;). Nama variable tidak boleh menggunakan spasi. Menulis angka yang terlalu panjang bisa menggunakan uderscore "_". Variable var pada java akan otomatis memberikan tipe data sesuai dengan isinya. Contoh variable :
- int Num_add;
- long balance = 1_000_000;
- var nama = "awang";
#### Konversi tipe data
Konversi dapat dilakukan dari tipe data yang sejenis. Contoh :
- int umur = 21;
- long umurLong = umur;
- byte umurByte = (byte) umur;
#### Contoh tipe data yang lainnya
- char a = "a";
- float pecahan;
- double desimal;

### Tipe data Primitive dan non-Primitive
Perbedaanya. Tipe data primitif hanya menunjukan data itu memiliki tipe tertentu. Tipe data non-PRimitif artinya kita menggunakan sebuah class yang mewakili sebuah tipe data. Sehingga untuk menggunakan tipe data bukan primitif kita harus membuat objek, objek dari class yang menjadi tipe data tadi. Keuntungan tipe data bukan primitif adalah kita akan mendapatka kemampuan kemampuan OOP ari tipe data tersebut. Tipe data primitif juga memiliki keunggulan tertentu yaitu cenderung lebih ringan.

### Array
Adalah sebuah data yang dapat menyimpan banyak data lainnya. setiap data disebut elemen. setiap elemen diberi tanda indeks. indeks di java diawali dair "0". Contoh
- char[] nama = new char[] {'a','w','a','n','g'}; atau
- nama[0] = 'a';
- nama[1] = 'w';
- nama[2] = 'a';
- nama[3] = 'n';
- nama[4] = 'g';

### Operator
1. Assigment (=).
2. Atithmatic (*,-,+,/,%)
3. Unary (+,-,++,--,!)
4. Equality dan Relational (==,!=,<,>,<=,>=)
5. Conditional (&&,||)

### Branching
Dengan kondisi tertentu menghasilkan output yang tertentu pula. jadi dengan kondisi yang berbeda, akan menghasilkan output yang berbeda.

- If-Then
- If-Then-Else
- Tenary
- Switch

### Looping
Merupakan sebuah aktivitas berulang yang ditentukan batsan awal dan batasan akhir.
- for
- while
- do-while
- for-each
1. Break akan mengakhiri seluruh proses perulangan.
2. Continue juga digunakan untuk menghentikan perulangan. tetapi Continue akan menghentikan perulangan pad langkah itu saja. atau melewati satu perulangan.

### I/O Input Output
Input adalah data yang masuk kedalam sebuah program. Bisa melalui file, keyboard, network,atauprogram lainnya.
Output adalah data yang dihasilkan oelh sebuah program. data dalam output dapat diletakan dalam berbagai cara. Console, file, network, atau dikirimkan ke program lain.

### Method
Adalah bagian dari code yang didalamnya terdapat code code program yang dapat dijalankan saat method tersebut di panggil. method diletakan dalam sebuah class. Method dapat memiliki input supaya dinamis. MEthod juga dapat memproduksi sebuah nilai, denan menggunakan "return". Method dapat memiliki argumen parameter yang tidak terbatas. Method overloading, java akan mengenali method mana yang di panggil berdasarkan parameter yang di masukan.

### Komentar
Memeberi catatan tambahan pada bafian code tertentu. komentar akan diabaikan. dapat dimanfaatkan agar suatu kode tidak dijalankan. (/* bla bla */, atau //)

## Task 1
### Vokal Konsonan
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/4_Basic%20Programming/screenshots/Screenshot_52.png)
## Task 2
### x dan o
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/4_Basic%20Programming/screenshots/Screenshot_53.png)
## Task 3
### Faktor Bilangan
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/4_Basic%20Programming/screenshots/Screenshot_54.png)
## Task 4
### Bilangan Prima
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/4_Basic%20Programming/screenshots/Screenshot_55.png)
## Task 5
### Kata Palindrome
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/4_Basic%20Programming/screenshots/Screenshot_56.png)
## Task 6
### Exponentation
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/4_Basic%20Programming/screenshots/Screenshot_57.png)
## Task 7
### piramida *
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/4_Basic%20Programming/screenshots/Screenshot_58.png)




