package `in`.browser.fiddle.search.engine

import `in`.browser.fiddle.R

/**
 * The Baidu search engine.
 *
 * See http://www.baidu.com/img/bdlogo.gif for the icon.
 */
class BaiduSearch : BaseSearchEngine(
        "file:///android_asset/baidu.png",
        "https://www.baidu.com/s?wd=",
        R.string.search_engine_baidu
)
