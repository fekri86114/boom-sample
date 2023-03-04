package info.fekri.boom.ux.adapter

import info.fekri.boom.ux.data.*
import info.fekri.boom.ux.retrofit.models.BuyBooksToUseData

interface ScienceEvents {

    fun onScienceItemClicked(book: ScienceData)
    fun onScienceItemLongClicked(book: ScienceData)

}

interface MoreUiEvents {
    fun onMoreUiItemClicked(book:MoreUiData)
    fun onMoreUiItemLongClicked(book: MoreUiData)
}

interface PoemsUiEvents {
    fun onPoemsUiItemClicked(book: PoemsUiData)
    fun onPoemsUiItemLongClicked(book: PoemsUiData)
}


// ---------------------------------------
interface BuyItemEvents {

    fun onBuyItemClicked(buyBookData: BuyBooksToUseData.Item)
    fun onBuyItemLongClicked(buyBookData: BuyBooksToUseData.Item)

}