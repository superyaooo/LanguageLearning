// Group object setup with Groovy object.with
given:
EnterprisyBasket basket = new EnterprisyBasket()
basket.with {
    setWarehouseInventory(warehouseInventory)
    setCustomerResolver(new DefaultCustomerResolver())
    setLanguage "english"
    setNumberOfCaches 3
    enableAutoRefresh()
}


// Group assertions to a single object with Spock Specification.with
then:
with(warehouseInventory) {
{
    !isEmpty()
    getBoxesMovedToday() == 3
    availableOfProduct("toshiba") == 2
    availableOfProduct("panasonic") == 3
    availableOfProduct("jvc") == 2
}
