package com.jaeshim.objects

data class Money (val amount: Long)
{
    operator fun plus(other:Money): Money{
        return Money(this.amount + other.amount);
    }

}