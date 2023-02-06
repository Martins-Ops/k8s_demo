#!/usr/bin/env groovy

pipeline {
    agent any
    stages {
        stage('init') {
            steps {
                script {
                    gv = load 'script.groovy'
                }
            }
        }
        // stage('InstallDep') {
        //     agent {
        //         docker { 
        //             image 'node:16.17.1-alpine'
        //         }
        //     }
        //     steps {
        //         script {
        //             gv.testdockerAgent()
        //         }
        //     }
        //  }
         
        stage('Build') {
            steps {
                script {
                    gv.buildImage 'martinsops/jendemoapp:1.0'
                }
            }
         }
    }
}