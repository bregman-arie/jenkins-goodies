jobs = jenkins.model.Jenkins.instance.items.findAll { job -> job.name =~ /pep8/ }

println "Number of jobs: " + jobs.size() + "\n"

jobs.each { job -> println job.name }
