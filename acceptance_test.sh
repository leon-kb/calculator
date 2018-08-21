#!/bin/bash
VARIABLE=$(curl localhost:8765/sum?a=1\&b=2);
[ "$VARIABLE" -eq 3 ]
