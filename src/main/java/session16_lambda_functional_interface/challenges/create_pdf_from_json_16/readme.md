### Json to PDF

---
#### Using

- openPDF com.github.librepdf
- spring web

#### What is happening

- incoming json gets mapped to Resume model
- in PDFGeneratorService I build the PDF page, in a very rigid way, not much room for customization
- ResumeController in makePDFBro() :
  - creates a resume entity? with the resumeService that does some validation
  - pdfGeneratorService builds the PDF and the response to the user

### Json example used
{
"title" : "Cool resume",
"personalDetails" : {
"name" : "John Doe",
"adress" : "123 Main St, Hometown, USA",
"phoneNumber" : 123456789,
"email" : "john.doe@gmail.com"
},
"objective" : "To leverage my 5 years of experience in Java development and problem-solving skills in a senior developer role, contributing to team successes through hard work and collaboration.",
"education" : {
"university" : "ABC University",
"degree" : "Bachelor of Science in Computer Science",
"graduationDate" : "May 2020"
},
"skills" : [
"- Java Programming",
"- Project Management",
"- Agile Methodologies",
"- Communication Skills"
]
}

