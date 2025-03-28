#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.donasiewallet --module-path aisco.product.donasiewallet -m aisco.product.donasiewallet &

wait