##Break & Continue
Break & Continue adalah kata kunci yang digunakan dalam perulangan

- Break digunakan untuk menghentikan perulangan
```aidl
    var a = 0
    while (a < 15){
        println("perlungan $a")
        a++
        if (a > 10){
            break
```
- Continue digunakan untuk menghentikan perulangan yang berjalan dan langsung melanjutkan ke perulangan berikutnya
```aidl
    for (i in 1..15){
        if (i ==10){
            continue
        }
        println(i)
```