#(20) Intro Rest API
##Resume
materi ini mempelajari :
1. API
2. Rest
3. Request Method
4. JSON
5. HTTP Response
6. Postman
7. 

keuntungan dari API ini adalah agar bisa diakses oleh multi-platform. 

###API
Application Programming Interface. APi adalah sebuah kumpulann dari fungsi-fungsi atau prosedur yang mengizinkan kita untuk mengakses
sebuah fitur atau data dari sebuah sistem operasi, aplikasi atau yang lainnya.

cara sebuah API bekerja.
1. ada sebuah request dari client ke server.
2. server memberi response ke client sesuai dengan permintaan yang tadi.

###REST
dengan satu backend bisa diakses oleh beberapa p;atform frontend.
REST adalah Representational State Transfer. sekumpilan aturan untuk membangun aplikasi yang tedistribusi. REST menggunakan
protocol HTTP untuk komunikasi. ketika membuat sebuah REST API kita mendesain sebuah end_point (https://www.instagram.com/api/users).
####HTTP requet method :
- GET (mengambil data)
- POST (memasukan data)
- PUT (edit data)
- DELETE (menghapus data)

####Request dan Response Format
- JSON
- XML
- SOAP

###JSON
Java Script object notation. adalah format data yang digunakan untuk pertukaran dan penyimpanan sebuah data. JSON mirip seperti struktur data MAP.
KEY-VAKUE. tipe data dalam JSON : String, Integer, Boolean, array, numbers, dan juga bisa JSON lagi.

###HTTP response
tujujannnya adalah untuk mengidentifikasi, sapakah sebuah request itu berhasil atau tidak. 
- 200 = ok,
- 201 = created,
- 400 = badrequest,
- 404 = not found,
- 401 = unauthorized,
- 405 = method not allowed,
- 500 = internal error,
- dan lain sebagainya

###API testing tools
- katalon
- apache J meter
- postman
- SoapUI
- Dan lain sebagainya.

###POSTMAN
adalah HTTP client untuk mlakukan testing sebuah web service. memudahkan untuk testing, development, dan dokumentasi.
end_point diletakan di bagian bar "Collection". ketika mengakases API perhatikan parameters, butuh autentikasi atau tidak, apakah butuh headers tertentu atau tidak,
body, dll.

###RestAPI DESIGN best practice
Use "Nouns(kata benda)" dibandingkan kata kerja. prefer menggunakam kata jamak (ibuhan "s") ex : cars. mengguakan resource nesting yang tepat untul
menampilkan relasi atau hirarki.

###Format Response JSON
{
    
    "meta": {
    }
    "data": {
    }
    "pagination": {
    }

}

di meta berisi informasi misalnya : status code, error mewssage, dll.
pada bagian data merupakan konten utama dari request yang telah dilakukan.

pada API juga bisa melakukan :
- filtering (misalkan berdasarkan region)
- sorting (asc, desc)
- paging (misalnya membatasi data yang tampil, "limit=100")
- field selection (untuk memilih data tertentu. misal data user dan email saja)

###Handling trailing Slashes(/)

POST:/cars

POST:/cars/

kedua nya harus sama sama bisa menampilkan data cars.

###Open API
API yang bisa diakses secara public. siapa saja bisa mengakses.

###Membuat Server API
ubtuk membuat sebuah `6`

###GET data API with Code

###Package net/http
sebuah untuk emebuat server API dan mengcomsume API. banyak krguanaan, seperti :
- decode JSON to object struct
- decode JSON to map[strings] interface{} dan interface{}
- decode array JSON to array Object
- Encode object to JSON strings.

##Task
1. Target API 1
   1. https://newsapi.org/
   2. 

2. Target API 2
   https://swapi.dev/

3. Target API 3
- api documentation
- api server
