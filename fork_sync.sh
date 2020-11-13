#!/bin/bash
git pull origin main
git fetch upstream main
git checkout main
git rebase upstream/main
git status
git push -f origin main
