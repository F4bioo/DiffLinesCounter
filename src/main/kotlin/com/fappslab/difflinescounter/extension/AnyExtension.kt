package com.fappslab.difflinescounter.extension

fun Any?.orFalse(): Boolean = this != null

fun Any?.isNull(): Boolean = this == null

fun Any?.isNotNull(): Boolean = this.isNull().not()
