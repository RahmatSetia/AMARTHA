# (15) Clean Code
## RESUME
materi ini mempelajari :
1. apa itu clean code
2. kenapa clean code
3. karakteristik clean code
4. KISS
5. DRY
6. refactoring

###Clean code
adalah istilah  untuk code yagn dibca, dipahami, dan diubah oleh programmer. manfaat dari clean code ketika bekerja dalam tim, semua anggota
bisa memahami code dengan baik dengan begitu bisa bekerja sama dengan baik dan efisien. selain itu feature develpmrnt menjadi berkualitas karena
mudah dibaca dan dipahami. faster development, karena mudah di baca menjadi kecepatran men-develope sebuah program jadi lebih cepat.

###Karakteristik Clean Code
1. nama variabel mudah dipahami. sebaiknya nama variabel mencerminkan fungsinya.
2. mudah dieja dan dicari. 
3. singkat namun mendeskripsikan konteks.
4. konsisten.
5. hindari penambahan konteks yang tidak perlu.
6. gunakan komentar seperlunya.
7. good function. pastikan parameter yang digunakan tidak terlalu banyak. sebisa mungkin menggunakan lokal variabel, jangan global variabel.
8. gunakan konvensi untuk referensi menulis code. 
9. formatting, sebaiknya : baris code 80-200 karakter, satu class 300-500 baris, code yang berhubungan saling berdekatan, dekatkan fungsi
dengan pemanggilannya, deklarasi variale berdekatan dengan penggunanya, perhatikan indentasi, menggunakan prettier atau formatter.

###KISS
Keep It So Simple. hindari membat fungsi yang dibuat untuk melakukan A, sekaligus memodifikasi B, mengecek fungsi C, dst.

####Tips KISS
- fungsi atai class harus kecil.
- fungsi dilakukan untuk satu tugas saja.
- jangan terlalu banyak argumen pada fungsi.
- harus diperhatikan untuk mencapai kondisi yang seimbang, kecil dan jumlahnya minimal.

###DRY Dont repeat yourself
duplikasi code sering terjadi karena sering copy paste. untuk menghindar itu, batlah fungsi yang dapat digunakan berkali-kali.

###Refactoring
proses refkonstruksi code yang dibuat, dengan cara mengubah struktur internal tanpa mengubah perilaku eksternal. KISS dan DRY bisa dicapa dengan refactor.
####teknik refactoring
- MEmbuat sebuah abstraksi.
- memecah code dengan fugsi atau class.
- perbaiki penamaan dan lokasi code.
- deteksi code yang memeiliki duplikasi.

### Task clean code sama dengan task join, union, agregasi, subquery, function