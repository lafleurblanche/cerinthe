package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.IndexConst
import net.konohana.sakuya.cerinthe.constant.RouteInfoEnjuRWConst

/**
 * ## 経路情報判定処理
 * * えんじゅ交通
 * @author lafleurblanche
 */
fun routeInfoEnjuRWSelect(from: String, to: String): String {
    val fromRoute = from.substring(IndexConst.INDEX_START, IndexConst.INDEX_END)
    val toRoute = to.substring(IndexConst.INDEX_START, IndexConst.INDEX_END)
    val routeMap = mapOf(
        Pair("RW01", "RW01") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2001,
        Pair("RW01", "RW02") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2002,
        Pair("RW01", "RW03") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2003,
        Pair("RW01", "RW04") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2004,
        Pair("RW01", "RW05") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2005,
        Pair("RW01", "RW06") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2006,
        Pair("RW01", "RW07") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2007,
        Pair("RW01", "RW08") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2008,
        Pair("RW01", "RW09") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2009,
        Pair("RW01", "RW10") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2010,
        Pair("RW01", "RW11") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2011,
        Pair("RW01", "RW12") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2012,
        Pair("RW01", "RW13") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2013,
        Pair("RW01", "RW14") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2014,
        Pair("RW01", "RW15") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2015,
        Pair("RW01", "RW16") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2016,
        Pair("RW01", "RW17") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2017,
        Pair("RW01", "RW18") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2018,
        Pair("RW01", "RW19") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2019,
        Pair("RW02", "RW01") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2020,
        Pair("RW02", "RW02") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2021,
        Pair("RW02", "RW03") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2022,
        Pair("RW02", "RW04") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2023,
        Pair("RW02", "RW05") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2024,
        Pair("RW02", "RW06") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2025,
        Pair("RW02", "RW07") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2026,
        Pair("RW02", "RW08") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2027,
        Pair("RW02", "RW09") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2028,
        Pair("RW02", "RW10") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2029,
        Pair("RW02", "RW11") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2030,
        Pair("RW02", "RW12") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2031,
        Pair("RW02", "RW13") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2032,
        Pair("RW02", "RW14") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2033,
        Pair("RW02", "RW15") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2034,
        Pair("RW02", "RW16") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2035,
        Pair("RW02", "RW17") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2036,
        Pair("RW02", "RW18") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2037,
        Pair("RW02", "RW19") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2038,
        Pair("RW03", "RW01") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2039,
        Pair("RW03", "RW02") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2040,
        Pair("RW03", "RW03") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2041,
        Pair("RW03", "RW04") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2042,
        Pair("RW03", "RW05") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2043,
        Pair("RW03", "RW06") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2044,
        Pair("RW03", "RW07") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2045,
        Pair("RW03", "RW08") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2046,
        Pair("RW03", "RW09") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2047,
        Pair("RW03", "RW10") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2048,
        Pair("RW03", "RW11") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2049,
        Pair("RW03", "RW12") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2050,
        Pair("RW03", "RW13") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2051,
        Pair("RW03", "RW14") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2052,
        Pair("RW03", "RW15") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2053,
        Pair("RW03", "RW16") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2054,
        Pair("RW03", "RW17") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2055,
        Pair("RW03", "RW18") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2056,
        Pair("RW03", "RW19") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2057,
        Pair("RW04", "RW01") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2058,
        Pair("RW04", "RW02") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2059,
        Pair("RW04", "RW03") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2060,
        Pair("RW04", "RW04") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2061,
        Pair("RW04", "RW05") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2062,
        Pair("RW04", "RW06") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2063,
        Pair("RW04", "RW07") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2064,
        Pair("RW04", "RW08") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2065,
        Pair("RW04", "RW09") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2066,
        Pair("RW04", "RW10") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2067,
        Pair("RW04", "RW11") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2068,
        Pair("RW04", "RW12") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2069,
        Pair("RW04", "RW13") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2070,
        Pair("RW04", "RW14") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2071,
        Pair("RW04", "RW15") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2072,
        Pair("RW04", "RW16") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2073,
        Pair("RW04", "RW17") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2074,
        Pair("RW04", "RW18") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2075,
        Pair("RW04", "RW19") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2076,
        Pair("RW05", "RW01") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2077,
        Pair("RW05", "RW02") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2078,
        Pair("RW05", "RW03") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2079,
        Pair("RW05", "RW04") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2080,
        Pair("RW05", "RW05") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2081,
        Pair("RW05", "RW06") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2082,
        Pair("RW05", "RW07") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2083,
        Pair("RW05", "RW08") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2084,
        Pair("RW05", "RW09") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2085,
        Pair("RW05", "RW10") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2086,
        Pair("RW05", "RW11") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2087,
        Pair("RW05", "RW12") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2088,
        Pair("RW05", "RW13") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2089,
        Pair("RW05", "RW14") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2090,
        Pair("RW05", "RW15") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2091,
        Pair("RW05", "RW16") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2092,
        Pair("RW05", "RW17") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2093,
        Pair("RW05", "RW18") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2094,
        Pair("RW05", "RW19") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2095,
        Pair("RW06", "RW01") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2096,
        Pair("RW06", "RW02") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2097,
        Pair("RW06", "RW03") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2098,
        Pair("RW06", "RW04") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2099,
        Pair("RW06", "RW05") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2100,
        Pair("RW06", "RW06") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2101,
        Pair("RW06", "RW07") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2102,
        Pair("RW06", "RW08") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2103,
        Pair("RW06", "RW09") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2104,
        Pair("RW06", "RW10") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2105,
        Pair("RW06", "RW11") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2106,
        Pair("RW06", "RW12") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2107,
        Pair("RW06", "RW13") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2108,
        Pair("RW06", "RW14") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2109,
        Pair("RW06", "RW15") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2110,
        Pair("RW06", "RW16") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2111,
        Pair("RW06", "RW17") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2112,
        Pair("RW06", "RW18") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2113,
        Pair("RW06", "RW19") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2114,
        Pair("RW07", "RW01") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2115,
        Pair("RW07", "RW02") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2116,
        Pair("RW07", "RW03") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2117,
        Pair("RW07", "RW04") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2118,
        Pair("RW07", "RW05") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2119,
        Pair("RW07", "RW06") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2120,
        Pair("RW07", "RW07") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2121,
        Pair("RW07", "RW08") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2122,
        Pair("RW07", "RW09") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2123,
        Pair("RW07", "RW10") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2124,
        Pair("RW07", "RW11") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2125,
        Pair("RW07", "RW12") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2126,
        Pair("RW07", "RW13") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2127,
        Pair("RW07", "RW14") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2128,
        Pair("RW07", "RW15") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2129,
        Pair("RW07", "RW16") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2130,
        Pair("RW07", "RW17") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2131,
        Pair("RW07", "RW18") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2132,
        Pair("RW07", "RW19") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2133,
        Pair("RW08", "RW01") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2134,
        Pair("RW08", "RW02") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2135,
        Pair("RW08", "RW03") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2136,
        Pair("RW08", "RW04") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2137,
        Pair("RW08", "RW05") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2138,
        Pair("RW08", "RW06") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2139,
        Pair("RW08", "RW07") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2140,
        Pair("RW08", "RW08") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2141,
        Pair("RW08", "RW09") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2142,
        Pair("RW08", "RW10") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2143,
        Pair("RW08", "RW11") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2144,
        Pair("RW08", "RW12") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2145,
        Pair("RW08", "RW13") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2146,
        Pair("RW08", "RW14") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2147,
        Pair("RW08", "RW15") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2148,
        Pair("RW08", "RW16") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2149,
        Pair("RW08", "RW17") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2150,
        Pair("RW08", "RW18") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2151,
        Pair("RW08", "RW19") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2152,
        Pair("RW09", "RW01") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2153,
        Pair("RW09", "RW02") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2154,
        Pair("RW09", "RW03") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2155,
        Pair("RW09", "RW04") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2156,
        Pair("RW09", "RW05") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2157,
        Pair("RW09", "RW06") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2158,
        Pair("RW09", "RW07") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2159,
        Pair("RW09", "RW08") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2160,
        Pair("RW09", "RW09") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2161,
        Pair("RW09", "RW10") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2162,
        Pair("RW09", "RW11") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2163,
        Pair("RW09", "RW12") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2164,
        Pair("RW09", "RW13") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2165,
        Pair("RW09", "RW14") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2166,
        Pair("RW09", "RW15") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2167,
        Pair("RW09", "RW16") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2168,
        Pair("RW09", "RW17") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2169,
        Pair("RW09", "RW18") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2170,
        Pair("RW09", "RW19") to RouteInfoEnjuRWConst.ROUTE_INFO_CODE_ENJURW2171,
    )
    return routeMap.getOrDefault(Pair(fromRoute, toRoute), "経路情報誤り")
}