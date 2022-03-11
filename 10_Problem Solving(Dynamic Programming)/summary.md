# (10) Problem Solving : Dynamic Programming
##Resume
Materi ini mempelajari :
1. Dynamic programming
2. Brute Force
3. Divide & Conquer
4. Greedy

### Dynamic programming
adalah alagoritma untuk menyelesaikan sebuah problem secara optimal dengan cara menjadikannya ke problem problem yang lebih simple.
dan lebih gampang kita kerjakan akan tetapi harus tetap mnegutamakan fakta optimalnya dari setiap problem. contoh permasalahna fobonacci number,
fibonacci number adalah menjumlahkan angka denan angka sebelumnya.

#### Characteristic Dynamic Programming
1. Overlapping Subproblems
Subproblems adalah versi kecil dari masalah yang asli nya. misal di fibonacci(4), kita harus menjabarkan ke dalam subproblem yang lebih kecil, yaitu fibonacci(3). fibonacci(3) 
juga di jabarkan ke subproblem yang lebih kecil lagi. begitu seterusnya sampai fobonacci(1). kemudian di jumlahkan dan ketemu nilai dari fibonacci(4).
Overlapping subproblem ketika suatu misalkan method di panggil beberapa kali. 
2. Optimal Substructure Property 
Sebuah problem mempunyai optimal substucture property jika semua optimal solusi bisa di dapatkan dari subproblem masalah itu sendiri.

#### Dynamic programming method
1. Top-down with Memorization
kita mencoba memecahkan masalahnya dengan recursive, dia akan terus mencari solusi dari solusi yang lebih kecil subproblems. Kita hanya mengambil dari data yang sudah kita simpan tadi.
contoh fibonacci recursive.
2. Bottom-up with Tabulation
Tabulation sebearnya adalah oposite (kebalikan) dari top-down dan untuk menghindari dari recursive. menyelesaikan masalh dari yang kecil terlebih dahulu. Biasanya bikin dimesional
tabel terlebih dahulu dari resourch yang sudah ada. Tabulation sebenernya kebalikan dari memorizations. dengan tabulation kita mencari dari nilai yang kecil terlebih dahulu.


## Code
### link tugas praktek :
[1_fibonacciNumberTopDown.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_10_dynamicProgramming/Problem1_fibonacciNumberTopDown.java).

[2_fibonacciNumberBottomUp.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_10_dynamicProgramming/Problem2_fibonacciNumberBottomUp.java).

[3_Frog.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_10_dynamicProgramming/Problem3_Frog.java).

[4_romanNumerals.java](https://github.com/RahmatSetia/AMARTHA/blob/master/src/main/java/com/alta/training/section_10_dynamicProgramming/Problem4_RomanNumerals.java).


## Task 1
### Fibonacci Number Top-down
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/10_Problem%20Solving(Dynamic%20Programming)/screenshots/Screenshot_97.png)
## Task 2
### Fibonacci Number Bottom-up
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/10_Problem%20Solving(Dynamic%20Programming)/screenshots/Screenshot_98.png)
## Task 3
### Frog
![This is an image]()
## Task 4
### Roman Numerals
![This is an image](https://github.com/RahmatSetia/AMARTHA/blob/master/10_Problem%20Solving(Dynamic%20Programming)/screenshots/Screenshot_98.png)