# (9) Problem Solving : Brute Force
##Resume
Materi ini mempelajari :
1. Apa itu pradigma problem solving
2. Brute Force
3. Divide & Conquer
4. Greedy

### paradigma problem solving
adalah bagaimana kita menyelesaikan sebuah masalah. ada beberpa pradigma :
- Brute force/complete search
- divide and conquer
- greedy aproach
- dynamic programing

setiap jenis di atas mempunai ciri ciri sendiri. 

#### Complete search
atau bruteforce, adalah bagaimana cara kita menyelesaikan sebuah masalah dengan cara melakukan sebuah pengecekan semua data. paradigma complete search ini kita gunakan ketika tidak ada algoritma yang lebih cepat. paling tidak notasi kompleksitas nya paling minimal adalah O(n).

### Divide and Conquer
Memecah data kelompok menjai bagian yang lebih kecil, biasanya dipecah menjadi dua atau basa disebut binary tree. bisa dilakukan di data yang telah urut. time complexity ddari bianry search yaitu O log n. pencarian data ini berdasarkan nilai yang di cari. awal mula menetukan indeks awal dan inddek akhir ari kumpulan data. lalu cari indeks tengah dari kumpulan data tersebut. kemudian bandingkan nulai yang di cari dengan indek tengah, apakah lebih besar ataukah lebih kecil. jika data yang di cari lebih kecil maka data yang lebih besar di abaikan begitupun sebaliknya. slalu kelompok kiri di pecah lagi, di cari nilai tengah nya lagi. lakukan seperti itu sampai data ketemu ataupun sampai overlap.

### Greedy
ketika menyelesaikan sebuah masalah kita mencari nilai optimal. biasanya diginakan di data yang berbentuk graph. seprti map, graphSql. local optimal disini di jelaskan ketika dari titik satu ke titik yang lain, di pilih jalan yang cost nya lebih murah. ada algoritma greedy yang lain seperti Huffman coding, Activity Selection, Djikstra algorithm, dan yang lainnya. 


## Code
### link tugas praktek :
[task1.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_9_ProblemSolving/problem1_simpleEquations.java).

[task2.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_9_ProblemSolving/problem2_moneyChange.java).

[task3.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_9_ProblemSolving/problem3_dragonOfLoowater.java).

[task4.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_9_ProblemSolving/problem4_binarySearchAlgorithm.java).

## Task 1
### Simple equator
![This is an image]()
## Task 2
### Money Change
![This is an image]()
## Task 3
### Dragon of loowater
![This is an image]()
## Task 4
### Binary search
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/9_Problem%20Solving(BruteForce)/screenshot/Screenshot_96.png)
