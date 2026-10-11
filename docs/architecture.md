# Architecture Documentation

## Problem Solved
Automates end-to-end setup, building, testing, and CI pipeline setup for Java 17 applications built with Maven and JUnit 5.

## AI Agent Components
- **Manifest:** .github/agents/build-engineer.agent.md defines core role and rules.
- **Skills:**
  - project-scaffold: Sets up directory structure and initial files.
  - uild-and-test: Manages Maven pom.xml and JUnit 5 setup.
  - github-actions: Generates matrix CI workflow across OS targets.
- **Prompts / Commands:**
  - git-init, create-project, create-build, create-actions, check.
  - init: Orchestration command executing all prompts sequentially.
