package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.IndexConst
import net.konohana.sakuya.cerinthe.constant.RouteCodeEnjuRWConst

/**
 * ## 経路コード判定処理
 * * えんじゅ交通
 * * FX(GUI版)用
 * @author lafleurblanche
 */
fun fxRouteCodeEnjuRWSelect(from: String, to: String): String {
    val fromRoute = from.substring(IndexConst.INDEX_START, IndexConst.INDEX_FX_END)
    val toRoute = to.substring(IndexConst.INDEX_START, IndexConst.INDEX_FX_END)
    val routeMap = mapOf(
        Pair("FRRW01", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2001,
        Pair("FRRW01", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2002,
        Pair("FRRW01", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2003,
        Pair("FRRW01", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2004,
        Pair("FRRW01", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2005,
        Pair("FRRW01", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2006,
        Pair("FRRW01", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2007,
        Pair("FRRW01", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2008,
        Pair("FRRW01", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2009,
        Pair("FRRW01", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2010,
        Pair("FRRW01", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2011,
        Pair("FRRW01", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2012,
        Pair("FRRW01", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2013,
        Pair("FRRW01", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2014,
        Pair("FRRW01", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2015,
        Pair("FRRW01", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2016,
        Pair("FRRW01", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2017,
        Pair("FRRW01", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2018,
        Pair("FRRW01", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2019,
        Pair("FRRW02", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2020,
        Pair("FRRW02", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2021,
        Pair("FRRW02", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2022,
        Pair("FRRW02", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2023,
        Pair("FRRW02", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2024,
        Pair("FRRW02", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2025,
        Pair("FRRW02", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2026,
        Pair("FRRW02", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2027,
        Pair("FRRW02", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2028,
        Pair("FRRW02", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2029,
        Pair("FRRW02", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2030,
        Pair("FRRW02", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2031,
        Pair("FRRW02", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2032,
        Pair("FRRW02", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2033,
        Pair("FRRW02", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2034,
        Pair("FRRW02", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2035,
        Pair("FRRW02", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2036,
        Pair("FRRW02", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2037,
        Pair("FRRW02", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2038,
        Pair("FRRW03", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2039,
        Pair("FRRW03", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2040,
        Pair("FRRW03", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2041,
        Pair("FRRW03", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2042,
        Pair("FRRW03", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2043,
        Pair("FRRW03", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2044,
        Pair("FRRW03", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2045,
        Pair("FRRW03", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2046,
        Pair("FRRW03", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2047,
        Pair("FRRW03", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2048,
        Pair("FRRW03", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2049,
        Pair("FRRW03", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2050,
        Pair("FRRW03", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2051,
        Pair("FRRW03", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2052,
        Pair("FRRW03", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2053,
        Pair("FRRW03", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2054,
        Pair("FRRW03", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2055,
        Pair("FRRW03", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2056,
        Pair("FRRW03", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2057,
        Pair("FRRW04", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2058,
        Pair("FRRW04", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2059,
        Pair("FRRW04", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2060,
        Pair("FRRW04", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2061,
        Pair("FRRW04", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2062,
        Pair("FRRW04", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2063,
        Pair("FRRW04", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2064,
        Pair("FRRW04", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2065,
        Pair("FRRW04", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2066,
        Pair("FRRW04", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2067,
        Pair("FRRW04", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2068,
        Pair("FRRW04", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2069,
        Pair("FRRW04", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2070,
        Pair("FRRW04", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2071,
        Pair("FRRW04", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2072,
        Pair("FRRW04", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2073,
        Pair("FRRW04", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2074,
        Pair("FRRW04", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2075,
        Pair("FRRW04", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2076,
        Pair("FRRW05", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2077,
        Pair("FRRW05", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2078,
        Pair("FRRW05", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2079,
        Pair("FRRW05", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2080,
        Pair("FRRW05", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2081,
        Pair("FRRW05", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2082,
        Pair("FRRW05", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2083,
        Pair("FRRW05", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2084,
        Pair("FRRW05", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2085,
        Pair("FRRW05", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2086,
        Pair("FRRW05", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2087,
        Pair("FRRW05", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2088,
        Pair("FRRW05", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2089,
        Pair("FRRW05", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2090,
        Pair("FRRW05", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2091,
        Pair("FRRW05", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2092,
        Pair("FRRW05", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2093,
        Pair("FRRW05", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2094,
        Pair("FRRW05", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2095,
        Pair("FRRW06", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2096,
        Pair("FRRW06", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2097,
        Pair("FRRW06", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2098,
        Pair("FRRW06", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2099,
        Pair("FRRW06", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2100,
        Pair("FRRW06", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2101,
        Pair("FRRW06", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2102,
        Pair("FRRW06", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2103,
        Pair("FRRW06", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2104,
        Pair("FRRW06", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2105,
        Pair("FRRW06", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2106,
        Pair("FRRW06", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2107,
        Pair("FRRW06", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2108,
        Pair("FRRW06", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2109,
        Pair("FRRW06", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2110,
        Pair("FRRW06", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2111,
        Pair("FRRW06", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2112,
        Pair("FRRW06", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2113,
        Pair("FRRW06", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2114,
        Pair("FRRW07", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2115,
        Pair("FRRW07", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2116,
        Pair("FRRW07", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2117,
        Pair("FRRW07", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2118,
        Pair("FRRW07", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2119,
        Pair("FRRW07", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2120,
        Pair("FRRW07", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2121,
        Pair("FRRW07", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2122,
        Pair("FRRW07", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2123,
        Pair("FRRW07", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2124,
        Pair("FRRW07", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2125,
        Pair("FRRW07", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2126,
        Pair("FRRW07", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2127,
        Pair("FRRW07", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2128,
        Pair("FRRW07", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2129,
        Pair("FRRW07", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2130,
        Pair("FRRW07", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2131,
        Pair("FRRW07", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2132,
        Pair("FRRW07", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2133,
        Pair("FRRW08", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2134,
        Pair("FRRW08", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2135,
        Pair("FRRW08", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2136,
        Pair("FRRW08", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2137,
        Pair("FRRW08", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2138,
        Pair("FRRW08", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2139,
        Pair("FRRW08", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2140,
        Pair("FRRW08", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2141,
        Pair("FRRW08", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2142,
        Pair("FRRW08", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2143,
        Pair("FRRW08", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2144,
        Pair("FRRW08", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2145,
        Pair("FRRW08", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2146,
        Pair("FRRW08", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2147,
        Pair("FRRW08", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2148,
        Pair("FRRW08", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2149,
        Pair("FRRW08", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2150,
        Pair("FRRW08", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2151,
        Pair("FRRW08", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2152,
        Pair("FRRW09", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2153,
        Pair("FRRW09", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2154,
        Pair("FRRW09", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2155,
        Pair("FRRW09", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2156,
        Pair("FRRW09", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2157,
        Pair("FRRW09", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2158,
        Pair("FRRW09", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2159,
        Pair("FRRW09", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2160,
        Pair("FRRW09", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2161,
        Pair("FRRW09", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2162,
        Pair("FRRW09", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2163,
        Pair("FRRW09", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2164,
        Pair("FRRW09", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2165,
        Pair("FRRW09", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2166,
        Pair("FRRW09", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2167,
        Pair("FRRW09", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2168,
        Pair("FRRW09", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2169,
        Pair("FRRW09", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2170,
        Pair("FRRW09", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2171,
        Pair("FRRW10", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2172,
        Pair("FRRW10", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2173,
        Pair("FRRW10", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2174,
        Pair("FRRW10", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2175,
        Pair("FRRW10", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2176,
        Pair("FRRW10", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2177,
        Pair("FRRW10", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2178,
        Pair("FRRW10", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2179,
        Pair("FRRW10", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2180,
        Pair("FRRW10", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2181,
        Pair("FRRW10", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2182,
        Pair("FRRW10", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2183,
        Pair("FRRW10", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2184,
        Pair("FRRW10", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2185,
        Pair("FRRW10", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2186,
        Pair("FRRW10", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2187,
        Pair("FRRW10", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2188,
        Pair("FRRW10", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2189,
        Pair("FRRW10", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2190,
        Pair("FRRW11", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2191,
        Pair("FRRW11", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2192,
        Pair("FRRW11", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2193,
        Pair("FRRW11", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2194,
        Pair("FRRW11", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2195,
        Pair("FRRW11", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2196,
        Pair("FRRW11", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2197,
        Pair("FRRW11", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2198,
        Pair("FRRW11", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2199,
        Pair("FRRW11", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2200,
        Pair("FRRW11", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2201,
        Pair("FRRW11", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2202,
        Pair("FRRW11", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2203,
        Pair("FRRW11", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2204,
        Pair("FRRW11", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2205,
        Pair("FRRW11", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2206,
        Pair("FRRW11", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2207,
        Pair("FRRW11", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2208,
        Pair("FRRW11", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2209,
        Pair("FRRW12", "TORW01") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2210,
        Pair("FRRW12", "TORW02") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2211,
        Pair("FRRW12", "TORW03") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2212,
        Pair("FRRW12", "TORW04") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2213,
        Pair("FRRW12", "TORW05") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2214,
        Pair("FRRW12", "TORW06") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2215,
        Pair("FRRW12", "TORW07") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2216,
        Pair("FRRW12", "TORW08") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2217,
        Pair("FRRW12", "TORW09") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2218,
        Pair("FRRW12", "TORW10") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2219,
        Pair("FRRW12", "TORW11") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2220,
        Pair("FRRW12", "TORW12") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2221,
        Pair("FRRW12", "TORW13") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2222,
        Pair("FRRW12", "TORW14") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2223,
        Pair("FRRW12", "TORW15") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2224,
        Pair("FRRW12", "TORW16") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2225,
        Pair("FRRW12", "TORW17") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2226,
        Pair("FRRW12", "TORW18") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2227,
        Pair("FRRW12", "TORW19") to RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2228,
    )
    return routeMap.getOrDefault(Pair(fromRoute, toRoute), "経路情報誤り")
}