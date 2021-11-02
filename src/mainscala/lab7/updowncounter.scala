// package lab7task
// import chisel3._
// import chisel3.util._
// class CounterUpDown(n:Int) extends Module{
// val io = IO(new Bundle {
// val data_in = Input(UInt(n.W))
// val out = Output(Bool())
// })
// val counter = RegInit(0.U(n.W))
// val max_count = RegInit(6.U(n.W))
// val init :: up :: down :: Nil = Enum (3) 
// val state = RegInit(init)// s t a t e = i n i t
// val up_flag = ( counter === max_count)
// val down_flag = (counter === 0.U)
// switch (state) {
// is (init) {
// state := up // o n r e s e t
// }
// is (up) {
// when (up_flag) {
// state := down
// // s t a r t c o u n t d o w n i m m e d i a t e l y o n u p _ f l a g
// counter := counter-1.U
// }. otherwise {
// counter := counter + 1.U
// }
// }
// is(down) {
// when(down_flag) {
// state := up
// counter := counter + 1.U
// max_count := io.data_in // l o a d t h e c o u n t e r
// }.otherwise {
// counter := counter - 1.U
// }
// }
// }
// io.out := up_flag | down_flag
// }