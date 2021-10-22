package lab1_tasks
import org.scalatest._
import chiseltest._
import chisel3._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class task2_test extends FreeSpec with ChiselScalatestTester{
    "task2 test" in {
    test(new task2(4.U)){ c =>
      c.clock.step(20)
      

    }

  }
}