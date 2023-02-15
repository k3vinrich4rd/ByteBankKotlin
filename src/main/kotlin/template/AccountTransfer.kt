package template

import template.Account

interface AccountTransfer {
    fun accountTransfer(value: Double, destiny: Account): Boolean
}
