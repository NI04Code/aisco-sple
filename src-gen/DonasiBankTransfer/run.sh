#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.donasibanktransfer --module-path aisco.product.donasibanktransfer -m aisco.product.donasibanktransfer &

wait