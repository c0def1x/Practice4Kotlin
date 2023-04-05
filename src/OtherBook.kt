import java.util.Calendar

class OtherBook : ProgrammingBook()
{
    private var _p: Int = 0

    fun Qp() : Double
    {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        return Q() - 0.2 * (currentYear - _p)
    }
}