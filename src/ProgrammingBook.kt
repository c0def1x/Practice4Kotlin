open class ProgrammingBook
{
    private var _title: String = ""
    private var _pageCount: Int = 50
    private var _price: Float = 200f

    fun ProgrammingBook(title: String, pageCount: Int, price: Float)
    {
        _title = title
        _pageCount = pageCount
        _price = price
    }

    fun Q(): Float
    {
        return _price / _pageCount
    }

    fun PrintObjectInfo()
    {
        println("Название: $_title")
        println("Количество страниц: $_pageCount")
        println("Цена: $_price")
    }
}