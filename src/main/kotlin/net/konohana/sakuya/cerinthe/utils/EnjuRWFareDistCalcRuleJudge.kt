package net.konohana.sakuya.cerinthe.utils

import net.konohana.sakuya.cerinthe.constant.FareDistCalcRuleConst
import net.konohana.sakuya.cerinthe.constant.RouteCodeEnjuRWConst

/**
 * 経路計算ルールを判定します。
 * * えんじゅ交通
 * @param routeCode 路線コード
 * @return 経路計算ルール
 */
fun enjuRWFareDistCalcRuleJudge(routeCode: String): String {
    val calcRuleMap = mapOf(
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2001 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2002 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D1,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2003 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D2,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2004 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D3,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2005 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D4,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2006 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E1,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2007 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E2,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2008 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E3,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2009 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E4,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2010 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E5,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2011 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E6,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2012 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E7,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2013 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E8,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2014 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E9,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2015 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E10,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2016 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D5,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2017 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C1,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2018 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D6,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2019 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D7,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2020 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D1,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2021 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2022 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D8,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2023 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D9,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2024 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D10,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2025 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E11,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2026 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E12,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2027 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E13,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2028 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E14,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2029 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E15,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2030 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E16,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2031 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E17,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2032 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E18,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2033 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E19,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2034 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E20,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2035 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D11,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2036 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C2,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2037 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D12,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2038 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D13,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2039 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D2,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2040 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D8,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2041 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2042 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D14,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2043 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D15,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2044 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E21,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2045 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E22,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2046 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E23,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2047 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E24,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2048 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E25,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2049 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E26,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2050 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E27,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2051 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E28,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2052 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E29,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2053 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E30,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2054 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D16,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2055 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C3,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2056 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D17,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2057 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D18,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2058 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D3,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2059 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D9,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2060 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D14,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2061 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2062 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D19,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2063 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E31,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2064 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E32,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2065 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E33,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2066 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E34,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2067 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E35,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2068 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E36,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2069 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E37,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2070 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E38,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2071 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E39,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2072 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E40,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2073 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D20,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2074 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C4,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2075 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D21,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2076 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D22,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2077 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D4,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2078 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D10,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2079 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D15,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2080 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D19,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2081 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2082 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E41,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2083 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E42,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2084 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E43,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2085 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E44,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2086 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E45,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2087 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E46,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2088 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E47,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2089 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E48,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2090 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E49,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2091 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E50,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2092 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D23,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2093 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C5,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2094 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D24,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2095 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D25,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2096 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E1,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2097 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E11,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2098 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E21,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2099 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E31,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2100 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E41,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2101 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2102 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D26,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2103 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D27,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2104 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D28,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2105 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F1,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2106 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F2,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2107 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F3,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2108 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F4,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2109 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F5,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2110 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F6,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2111 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E51,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2112 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D29,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2113 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C6 ,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2114 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E52,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2115 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E2,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2116 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E12,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2117 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E22,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2118 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E32,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2119 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E42,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2120 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D26,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2121 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2122 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D30,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2123 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D31,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2124 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F7,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2125 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F8,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2126 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F9,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2127 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F10,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2128 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F11,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2129 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F12,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2130 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E53,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2131 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D32,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2132 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C7,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2133 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E54,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2134 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E3,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2135 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E13,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2136 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E23,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2137 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E33,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2138 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E43,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2139 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D27,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2140 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D30,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2141 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2142 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D33,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2143 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F13,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2144 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F14,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2145 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F15,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2146 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F16,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2147 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F17,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2148 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F18,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2149 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E55,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2150 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D34,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2151 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C8,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2152 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E56,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2153 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E4,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2154 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E14,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2155 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E24,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2156 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E34,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2157 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E44,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2158 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D28,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2159 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D31,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2160 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D33,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2161 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2162 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F19,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2163 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F20,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2164 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F21,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2165 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F22,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2166 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F23,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2167 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F24,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2168 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E57,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2169 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D35,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2170 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C9,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2171 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E58,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2172 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E5,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2173 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E15,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2174 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E25,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2175 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E35,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2176 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E45,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2177 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F1,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2178 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F7,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2179 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F13,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2180 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F19,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2181 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2182 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D36,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2183 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D37,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2184 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D38,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2185 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D39,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2186 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D40,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2187 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F25,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2188 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E59A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2189 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E59,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2190 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C10,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2191 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E6,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2192 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E16,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2193 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E26,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2194 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E36,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2195 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E46,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2196 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F2,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2197 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F8,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2198 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F14,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2199 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F20,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2200 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D36,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2201 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2202 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D41,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2203 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D42,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2204 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D43,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2205 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D44,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2206 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F26,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2207 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E60A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2208 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E60,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2209 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C11,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2210 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E7,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2211 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E17,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2212 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E27,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2213 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E37,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2214 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E47,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2215 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F3,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2216 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F9,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2217 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F15,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2218 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F22,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2219 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D37,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2220 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D41,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2221 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_A,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2222 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D45,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2223 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D46,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2224 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_D47,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2225 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_F27,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2226 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E61,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2227 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_E61,
        RouteCodeEnjuRWConst.ROUTE_CODE_ENJURW2228 to FareDistCalcRuleConst.FAREDIST_CALCRULE_PATTERN_C12,
    )
    return calcRuleMap.getOrDefault(routeCode, "NotFound")
}
