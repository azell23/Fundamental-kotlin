##Tipe data Array
Tipe data yang berisikan kumpulan data dengan tipe data yang sama
```aidl
val members:Array<String> = arrayof("hil","dan","Riz")
val Function.angka:Array<Byte> = arrayof(1,2,3)
```
##Operasi Array
 |Operasi|Keterangan|
 |-------|----------|
 |Size   |Untuk mendapatkan panjang Array|
 |get(index)| mendapat data di posisi index|
 |[index]   |mendapat data diposisi index |
 |set(index,value)|mengubah data diposisi index |
 |[index] = value|mengubah data di posisi index |
##Array nullable
Data pada Function.array di kotlin tidak boleh null,jika ingin membuat datanya boleh null ,bisa menggunakan tanda tanya(?)
```aidl
val Function.name:Array<String?> = arrayOfNulls(size:5)
Function.name.set(0,"hil")
Function.name.set(1,null)
Function.name.set(2,"dan")
```

 