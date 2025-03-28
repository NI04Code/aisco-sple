#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.donasicc --module-path aisco.product.donasicc -m aisco.product.donasicc &

wait