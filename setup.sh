echo
read -r -p "Enter your name (First Last): " name
read -r -p "Enter your email: " email
read -r -p "Enter your cohort (c or java): " cohort
read -r -p "Enter your bitbucket team (e.g. te-cin-cohort-4): " team

echo
echo "Setting Up Global Configuration Settings"

git config --global user.name "${name}"
git config --global user.email "${email}"

echo "Setting up Git Editors and Tools..."

git config --global core.editor "code -w -n"
git config --global diff.tool code
git config --global difftool.code.cmd "code -w -d $LOCAL $REMOTE"

echo
echo "Configuring Upstream..."

git remote add upstream "https://bitbucket.org/${team}/${cohort}-main"
git config branch.master.mergeOptions "--no-edit"

echo "Done."