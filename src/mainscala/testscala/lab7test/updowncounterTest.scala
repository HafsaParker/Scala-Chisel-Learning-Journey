// package lab7task
// import chisel3._

// import chisel3. iotesters .{Driver,PeekPokeTester}
// class TestCounterUpDown(c:CounterUpDown) extends PeekPokeTester(c) {
// var data_in=6
// poke(c.io.data_in, data_in.U)
// step(40)
// data_in=10
// poke(c.io.data_in,data_in.U)
// step(50)
// }

// object CounterUpDown_Main extends App {
// iotesters.Driver.execute(Array( " - - i s - v e r b o s e " ,
// " - - g e n e r a t e - v c d - o u t p u t " , " o n " , " - - b a c k e n d - n a m e " , " f i r r t l " ) ,
// () => new CounterUpDown(8)){ c=> new TestCounterUpDown(c)}
// }