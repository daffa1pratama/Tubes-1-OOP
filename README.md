# Tugas Besar 1 Pemrograman Berorientasi Objek
## Semester 2 Tahun 2019/2020

## Kelompok 1 / K03
* 13518033 / Daffa Pratama Putra
* 13518060 / Irfan Dwi Kusuma
* 13518090 / Arthur Edgar Yunanto
* 13518120 / Yonatan Viody
* 13518126 / Evan Pradanika

## Struktur Kode
TheCalculator
├───src
   ├───main
   │   ├───kotlin
   │   │   └───com
   │   │       └───haverzard
   │   │           └───smartcalculator
   │   │               ├───app
   │   │               │       MyApp.kt
   │   │               │       Styles.kt
   │   │               ├───exception
   │   │               │       DivisionException.kt
   │   │               │       ImaginaryException.kt
   │   │               │       TanException.kt
   │   │               ├───expfinder
   │   │               │       BinaryFinder.kt
   │   │               │       ExpressionFinder.kt
   │   │               │       UnaryFinder.kt
   │   │               ├───expression
   │   │               │       BinaryExpression.kt
   │   │               │       CosExpression.kt
   │   │               │       DivisionExpression.kt
   │   │               │       Expression.kt
   │   │               │       MultiplicationExpression.kt
   │   │               │       NegativeExpression.kt
   │   │               │       RootExpression.kt
   │   │               │       SinExpression.kt
   │   │               │       SquareExpression.kt
   │   │               │       SubtractExpression.kt
   │   │               │       SumExpression.kt
   │   │               │       TanExpression.kt
   │   │               │       TerminalExpression.kt
   │   │               │       UnaryExpression.kt
   │   │               ├───history
   │   │               │       History.kt
   │   │               ├───iohandler
   │   │               │       InputHandler.kt
   │   │               │       IOHandler.kt
   │   │               │       OutputHandler.kt
   │   │               │       Solver.kt
   │   │               ├───parser
   │   │               │       CompanionParser.kt
   │   │               └───view
   │   │                       MainView.kt
   │   └───resources
   │          Cross.png
   │          Divide.png
   │          Equal.png
   │          exit.png
   │          Minus.png
   │          Plus.png
   └───test
       └───kotlin
           └───com
               └───haverzard
                   └───smartcalculator
                       ├───exception
                       │       ExceptionTest.kt                     
                       ├───expfinder
                       │       BinaryFinderTest.kt
                       │       UnaryFinderTest.kt                       
                       ├───expression
                       │       BinaryExpressionTest.kt
                       │       TerminalExpressionTest.kt
                       │       UnaryExpressionTest.kt                       
                       ├───history
                       │       HistoryTest.kt                       
                       ├───iohandler
                       │       IOHandlerTest.kt                       
                       └───parser
                               CompanionParserTest.kt                       
## Cara Compile & Run
Program yang dibuat dapat dijalankan menggunakan IntelliJ IDEA dengan tambahan plugin TornadoFX dan library JavaFX.
1. Buka IntelliJ IDEA
2. Buka kode program MyApp.kt pada direktori TheCalculator\src\main\kotlin\com\haverzard\smartcalculator\app\MyApp.kt
3. Pencet tombol run pada bagian atas toolbar (tanda panah berwarna hijau)
4. Apabila terjadi error ada beberapa kemungkinan :
  * JavaFX tidak terdeteksi   : ikuti langkah pada https://www.jetbrains.com/help/idea/javafx.html
  * SDK belum disetting       : pilih SDK yang sesuai pada File/Project Structure
  * JUnit tidak terdeteksi    : ikuti langkah pada https://www.youtube.com/watch?v=Bld3644bIAo&t=322s
  * TornadoFX belum ada       : download plugin TornadoFX terlebih dulu
5. IntelliJ IDEA akan melakukan build dan compile
6. Kalkulator siap digunakan
