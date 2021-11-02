package lab1_tasks
import org.scalatest._
import chiseltest._
import chisel3._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

// class task1_test extends FreeSpec with ChiselScalatestTester{
//     "task1_test" in {
//     test(new task1(4.U)).withAnnotations(Seq(VerilatorBackendAnnotation)){ c =>
//       c.clock.step(30)
      

//     }

//   }
// }

class task1_test extends FreeSpec with ChiselScalatestTester{
    "task1 test" in {
    test(new task1(4.U)){ c =>
      c.clock.step(30)
    }
    }
}