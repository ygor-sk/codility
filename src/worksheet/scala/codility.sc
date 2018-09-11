def slides = {
  val x = Array(50,40,30,50, 10, 1, 70).view.zipWithIndex
  x.sliding(2) ++ x.sliding(3)
}
def averages = slides.map(slide => {
  val (_, index) = slide.head
  val average = slide.map { case (value, _) => value}.sum / slide.length.toDouble
  (index, average)
})
averages.foreach(println)
val minimum = averages.minBy { case (_, average) => average}
val (result, _) = minimum



