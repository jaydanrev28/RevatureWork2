class Student{
    private id: number;
    private name: string;
    private passMark = 40;
    private _x;


    get x(){
        return this._x;
    }
    set X(value){
        if(value < 0)
            throw new Error('error')
        this._x = value;
    }

    get Id(){
        return this.id;
    }

    set Id(value){
        if(value <0){
            throw new Error('cannot be a nagative value')
        }
    }
 
    // getId(){
    //     return this.id;
    // }

    // setId(value){
    //     if(value < 0)
    //         throw new Error('id can not be negative')
    //     this.id = value;
    // }
}

let student = new Student();

student.X = '''



// student.setId(50)
// console.log(student.getId())

// student.name = null;
// student.passMark = 20;
//console.log(`Id: ${student.id}, Name: ${student.name}, PassMark: ${student.passMark}`);